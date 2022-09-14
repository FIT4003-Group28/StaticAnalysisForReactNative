package com.teslamotors.plugins.ble.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.v4.i.i;
import com.baidu.mapapi.UIMsg;
import com.google.protobuf.u;
import com.teslamotors.a.a;
import com.teslamotors.plugins.ble.g;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.spongycastle.asn1.x509.DisplayText;
/* compiled from: Peripheral.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f5178a;

    /* renamed from: b  reason: collision with root package name */
    private final BluetoothDevice f5179b;

    /* renamed from: c  reason: collision with root package name */
    private BluetoothGatt f5180c;

    /* renamed from: d  reason: collision with root package name */
    private final com.teslamotors.plugins.ble.b f5181d;
    private final BluetoothAdapter e;
    private final Context f;
    private BluetoothGattService j;
    private String m;
    private String n;
    private Handler s;
    private HandlerThread t;
    private volatile long l = 0;
    private int o = 0;
    private byte[] p = new byte[DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE];
    private int q = 0;
    private int r = 0;
    private Queue<i<byte[], String>> x = new ArrayBlockingQueue(10);
    private boolean y = false;
    private Runnable z = new Runnable() { // from class: com.teslamotors.plugins.ble.a.c.4
        @Override // java.lang.Runnable
        public void run() {
            if (c.this.m() == null || !c.this.b() || !c.this.y) {
                return;
            }
            if (c.this.m().readRemoteRssi()) {
                c.this.l().postDelayed(c.this.z, 1000L);
            } else {
                c.this.f5181d.f(c.this);
            }
        }
    };
    private final BluetoothGattCallback A = new BluetoothGattCallback() { // from class: com.teslamotors.plugins.ble.a.c.5
        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            byte[] value = bluetoothGattDescriptor.getValue();
            boolean equals = Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            c.this.a(String.format("%s onDescriptorWrite - status: 0x%02X, value: %s attempts: %d", c.this, Integer.valueOf(i), g.a(value), Integer.valueOf(c.this.o)));
            if (!equals || i == 0) {
                c.this.u.set(false);
                if (!c.this.f5181d.b(c.this) || !Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                    return;
                }
                c.this.q = 0;
                c.this.r = 0;
                c.this.f5181d.d(c.this);
            } else if (c.this.o > 5) {
            } else {
                c.k(c.this);
                c.this.s.post(new Runnable() { // from class: com.teslamotors.plugins.ble.a.c.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.i();
                    }
                });
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            c.this.a(String.format("%s onDescriptorRead - status: 0x%02X, value: %s", c.this, Integer.valueOf(i), g.a(bluetoothGattDescriptor.getValue())));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            c.this.a(String.format("%s onReliableWriteCompleted - status: 0x%02Xs", c.this, Integer.valueOf(i)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            c.this.a(String.format("%s onPhyUpdate: txPhy %d rxPhy %d", c.this, Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            c.this.a(String.format("%s onPhyRead: txPhy %d rxPhy %d status: 0x%02s", c.this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            String str = "UNKNOWN";
            switch (i2) {
                case 0:
                    str = "DISCONNECTED";
                    break;
                case 1:
                    str = "CONNECTING";
                    break;
                case 2:
                    str = "CONNECTED";
                    break;
                case 3:
                    str = "DISCONNECTING";
                    break;
            }
            c.this.a(String.format("%s onConnectionStateChange: %s status: 0x%02X", c.this, str, Integer.valueOf(i)));
            if (i2 == 0) {
                c.this.s();
                c.this.o();
                c.this.l().removeCallbacksAndMessages(c.this.d());
                if (c.this.v) {
                    c.this.a(String.format("Disconnected from finished peripheral %s", c.this));
                    try {
                        bluetoothGatt.close();
                    } catch (Exception e) {
                        c.this.a(String.format("Failed to close gatt after finishing use of %s", c.this), e);
                    }
                    c.this.t();
                    return;
                }
                c.this.f5181d.c(c.this);
                if (c.this.e.isEnabled()) {
                    c.this.c(i);
                } else {
                    c.this.a(String.format("Disconnected from %s but adapter is not on; doing nothing", c.this));
                }
            } else if (i2 == 2) {
                if (c.this.v) {
                    c.this.a(String.format("Got CONNECTED callback for peripheral when 'finished' - %s", c.this), (Exception) null);
                    return;
                } else if (i == 0 && !c.this.b()) {
                    c.this.d(true);
                    c.this.a("Requesting MTU of size 115");
                    bluetoothGatt.requestMtu(115);
                    c.this.u.set(true);
                }
            }
            c.this.f5181d.a(c.this, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            c.this.u.set(false);
            if (i == 0) {
                c.this.a(String.format("onServicesDiscovered Success - %s - status: 0x%02X", c.this, Integer.valueOf(i)));
                c.this.b(bluetoothGatt.getService(com.teslamotors.plugins.ble.a.f5169b));
                return;
            }
            c.this.a("onServicesDiscovered Failure", new Exception(String.format("onServicesDiscovered Failure - %s - status: 0x%02X", c.this, Integer.valueOf(i))));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(value == null ? 0 : value.length);
            c.this.a(String.format("onCharacteristicRead: %s - status 0x%02X", String.format("(%s)", objArr), Integer.valueOf(i)));
            if (com.teslamotors.plugins.ble.a.f.equals(bluetoothGattCharacteristic.getUuid())) {
                byte[] value2 = bluetoothGattCharacteristic.getValue();
                c.this.a(String.format("Got serial port version: %s", g.a(value2)));
                c.this.f5181d.a(value2);
                c.this.u.set(false);
                c.this.a(true);
                c.this.f5181d.a(c.this);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            String a2 = g.a(bluetoothGattCharacteristic.getValue());
            boolean z = false;
            c.this.u.set(false);
            c.this.r();
            c.this.a(String.format("%s - onCharacteristicWrite: %s - status 0x%02X, %s", c.this, bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i), String.format("(%s)", Integer.valueOf(a2.length() / 2))));
            com.teslamotors.plugins.ble.b bVar = c.this.f5181d;
            if (i == 0) {
                z = true;
            }
            bVar.a(z, i == 0 ? null : "PHONE_KEY_TRANSMISSION_FAILURE", a2, c.this);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            String format = String.format("(%s)", Integer.valueOf(value.length));
            String format2 = (c.this.q <= 0 || c.this.r <= 0) ? "[new buffer]" : String.format("[%d bytes remaining]", Integer.valueOf(c.this.r - c.this.q));
            if (!c.this.f5181d.e(c.this)) {
                c.this.a(String.format("%s - onCharacteristicChanged - Wrong peripheral! ignoring %s", c.this, format));
            } else if (value == null || value.length == 0) {
                c.this.a(String.format("%s - onCharacteristicChanged - got empty data from VCSEC! ignoring %s", c.this, format));
            } else {
                c.this.a(String.format("%s - onCharacteristicChanged - %s - %s", c.this, format, format2));
                c.this.a(value);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 0) {
                c.this.a(i);
            } else {
                c.this.a(String.format("Failed to get RSSI for %s", c.this));
                c.this.a(-1000);
            }
            c.this.f5181d.a(false);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            g.b(bluetoothGatt.getDevice().getAddress());
            c.this.a(String.format("MTU Size changed to %s with status 0x%02X on %s", Integer.valueOf(i), Integer.valueOf(i2), c.this));
            c.this.u.set(false);
            if (bluetoothGatt.getService(com.teslamotors.plugins.ble.a.f5169b) != null) {
                c.this.a(String.format("Already know about services on %s, discovering anyway", c.this));
            }
            c.this.l().postAtTime(new a(), c.this.d(), SystemClock.uptimeMillis());
        }
    };
    private AtomicBoolean h = new AtomicBoolean(false);
    private AtomicLong k = new AtomicLong(0);
    private AtomicBoolean u = new AtomicBoolean(false);
    private AtomicBoolean i = new AtomicBoolean(false);
    private boolean v = false;
    private volatile int g = -1000;
    private boolean w = false;

    static /* synthetic */ int k(c cVar) {
        int i = cVar.o;
        cVar.o = i + 1;
        return i;
    }

    public c(String str, BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt, com.teslamotors.plugins.ble.b bVar, BluetoothAdapter bluetoothAdapter, Context context) {
        this.f5178a = str;
        this.f5179b = bluetoothDevice;
        this.f5180c = bluetoothGatt;
        this.f5181d = bVar;
        this.e = bluetoothAdapter;
        this.f = context;
        this.n = bluetoothDevice.getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler l() {
        if (this.t == null) {
            this.t = new HandlerThread(this.f5178a + "-" + this.f5179b.getAddress());
            this.t.start();
            this.s = new Handler(this.t.getLooper());
        }
        return this.s;
    }

    public String a() {
        return this.f5178a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BluetoothGatt m() {
        return this.f5180c;
    }

    private void a(BluetoothGatt bluetoothGatt) {
        this.f5180c = bluetoothGatt;
    }

    public boolean b() {
        return this.h.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.h.set(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.g = i;
    }

    public int c() {
        if (this.h.get()) {
            return this.g;
        }
        return -1000;
    }

    public String d() {
        String address = this.f5179b.getAddress();
        if (!this.n.equalsIgnoreCase(address)) {
            a(String.format("Unexpected MAC address change from %s to %s", g.b(this.n), g.b(address)), (Exception) null);
        }
        return this.n;
    }

    public String e() {
        if (this.m == null) {
            this.m = g.b(this.f5179b.getAddress());
        }
        return this.m;
    }

    public String toString() {
        String e = e();
        Object[] objArr = new Object[4];
        objArr[0] = this.f5178a;
        objArr[1] = e;
        objArr[2] = Integer.valueOf(hashCode());
        objArr[3] = this.h.get() ? "connected" : "disconnected";
        return String.format("%s - %s (%s) (%s)", objArr);
    }

    public void a(boolean z) {
        this.i.set(z);
    }

    public boolean f() {
        return this.i.get();
    }

    private void a(BluetoothGattService bluetoothGattService) {
        this.j = bluetoothGattService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BluetoothGattService n() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.k.set(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.k.set(SystemClock.elapsedRealtime());
        if (z) {
            p();
        }
    }

    private void p() {
        this.l = SystemClock.elapsedRealtime();
    }

    public boolean g() {
        return this.l + 10000 < SystemClock.elapsedRealtime();
    }

    public long h() {
        return (SystemClock.elapsedRealtime() - this.l) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return this.k.get() + 5000 > SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGattService bluetoothGattService) {
        if (bluetoothGattService != null && com.teslamotors.plugins.ble.a.f5169b.equals(bluetoothGattService.getUuid())) {
            a(bluetoothGattService);
            List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            a(String.format("tesla service found - %s - %s characteristics", this, Integer.valueOf(characteristics.size())));
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                a(String.format("characteristic found - %s - %s", this, uuid));
                if (com.teslamotors.plugins.ble.a.e.equals(uuid)) {
                    z = true;
                } else if (com.teslamotors.plugins.ble.a.f5171d.equals(uuid)) {
                    z2 = true;
                } else if (com.teslamotors.plugins.ble.a.f.equals(uuid) && !this.f5181d.g()) {
                    z3 = m().readCharacteristic(bluetoothGattCharacteristic);
                }
                if (z && z2) {
                    Object[] objArr = new Object[2];
                    objArr[0] = this;
                    objArr[1] = z3 ? "including" : "NOT including";
                    a(String.format("%s - Found RX and TX characteristics, %s version", objArr));
                    if (z3) {
                        return;
                    }
                    this.u.set(false);
                    a(true);
                    this.f5181d.a(this);
                    return;
                }
            }
        }
        a(String.format("%s - DID NOT find RX and TX characteristics!", this));
    }

    public boolean i() {
        boolean z;
        BluetoothGatt m;
        BluetoothGattDescriptor descriptor;
        a(String.format("requestIndications: %s", this));
        try {
            BluetoothGattService n = n();
            if (n == null) {
                a(String.format("Null mGatt service on %s - cannot register for notifications", this));
                return false;
            }
            BluetoothGattCharacteristic characteristic = n.getCharacteristic(com.teslamotors.plugins.ble.a.e);
            if (characteristic == null) {
                a(String.format("Null FROM_VEHICLE characteristic on %s - cannot register for notifications", this));
                return false;
            }
            boolean z2 = com.teslamotors.plugins.ble.a.e.equals(characteristic.getUuid()) && (m = m()) != null && (descriptor = characteristic.getDescriptor(com.teslamotors.plugins.ble.a.g)) != null && descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) && m.writeDescriptor(descriptor) && m.setCharacteristicNotification(characteristic, true);
            try {
                if (z2) {
                    this.u.set(true);
                    a(String.format("%s - Registered for indications on %s, waiting for callback", this, com.teslamotors.plugins.ble.a.e));
                } else {
                    a(String.format("%s - Failed to register for indications on %s", this, com.teslamotors.plugins.ble.a.e));
                }
                return z2;
            } catch (Exception e) {
                z = z2;
                e = e;
                a(String.format("%s - Failed to register for indications on %s", this, com.teslamotors.plugins.ble.a.e), e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    private int b(int i) {
        if (i != 0 && i != 8) {
            if (i == 22) {
                return UIMsg.m_AppUI.MSG_APP_DATA_OK;
            }
            if (i != 34) {
                if (i == 133) {
                    return UIMsg.m_AppUI.MSG_APP_DATA_OK;
                }
                a(String.format("Got unknown status code: 0x%02X", Integer.valueOf(i)));
                return UIMsg.d_ResultType.SHORT_URL;
            }
        }
        return UIMsg.d_ResultType.SHORT_URL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        a.o b2 = b(bArr);
        if (b2 == null) {
            return;
        }
        this.f5181d.a(b2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        l().post(new Runnable() { // from class: com.teslamotors.plugins.ble.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (!c.this.u.get()) {
                    c.this.u.set(true);
                    c.this.a((i) c.this.x.poll());
                }
            }
        });
    }

    public void a(byte[] bArr, String str) {
        if (this.x.offer(new i<>(bArr, str))) {
            a(String.format("Added message %s - %s to queue of size %d", g.a(bArr), str, Integer.valueOf(this.x.size() - 1)));
        } else {
            a(String.format("Failed to add message %s - %s to queue of size %s", g.a(bArr), str, Integer.valueOf(this.x.size())));
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final i<byte[], String> iVar) {
        if (iVar == null) {
            this.u.set(false);
        } else {
            l().post(new Runnable() { // from class: com.teslamotors.plugins.ble.a.c.2
                @Override // java.lang.Runnable
                public void run() {
                    BluetoothGatt m = c.this.m();
                    BluetoothGattService n = c.this.n();
                    String a2 = g.a((byte[]) iVar.f469a);
                    String format = String.format("(%s)", Integer.valueOf(a2.length()));
                    if (m == null || n == null) {
                        c.this.a("Failed to write to car - peripheral Gatt or Gatt Service was null!");
                        c.this.u.set(false);
                        c.this.f5181d.a(false, "PHONE_KEY_TRANSMISSION_FAILURE", a2, c.this);
                        return;
                    }
                    BluetoothGattCharacteristic characteristic = n.getCharacteristic(com.teslamotors.plugins.ble.a.f5171d);
                    if (characteristic == null) {
                        c.this.a(String.format("Failed to write to car on %s - empty TX characteristic!", c.this), (Exception) null);
                        c.this.u.set(false);
                        c.this.f5181d.a(false, "PHONE_KEY_TRANSMISSION_FAILURE", a2, c.this);
                        return;
                    }
                    try {
                        if (characteristic.setValue((byte[]) iVar.f469a) && m.writeCharacteristic(characteristic)) {
                            c.this.a(String.format("%s - Sending %s: %s", c.this, iVar.f470b, format));
                            return;
                        }
                    } catch (Exception e) {
                        c.this.a(String.format("%s - Exception when sending %s: %s", c.this, iVar.f470b, format), e);
                    }
                    c.this.a(String.format("%s - Failed to send %s: %s", c.this, iVar.f470b, format), (Exception) null);
                    c.this.u.set(false);
                    c.this.f5181d.a(false, "PHONE_KEY_TRANSMISSION_FAILURE", a2, c.this);
                }
            });
        }
    }

    private a.o b(byte[] bArr) {
        a.o oVar = null;
        if (this.q == 0 && this.r == 0) {
            int i = (bArr[0] << 8) | (bArr[1] & 255);
            if (i > 200 || i < 0) {
                a(String.format("Got 'initial' message with length header of %d, ignoring", Integer.valueOf(i)));
                return null;
            }
            a(String.format("Got 'initial' message with length header of %d", Integer.valueOf(i)));
            this.r = i;
            this.q = bArr.length - 2;
            System.arraycopy(bArr, 2, this.p, 0, bArr.length - 2);
        } else if (bArr.length <= this.r - this.q) {
            System.arraycopy(bArr, 0, this.p, this.q, bArr.length);
            this.q += bArr.length;
        } else {
            a(String.format("Failed to add data of length %s to buffer of size %s with %s remaining. Clearing buffer", Integer.valueOf(bArr.length), Integer.valueOf(this.r), Integer.valueOf(this.r - this.q)));
            this.q = 0;
            this.r = 0;
            return null;
        }
        if (this.q >= this.r) {
            try {
                a(" Received complete message: " + String.format("(%s bytes)", Integer.valueOf(this.r)));
                oVar = a.o.a(Arrays.copyOfRange(this.p, 0, this.r));
            } catch (u e) {
                a(String.format("Failed to deserialize message: %s", e.toString()), (Exception) null);
            }
            this.r = 0;
            this.q = 0;
        }
        return oVar;
    }

    public void j() {
        String d2 = d();
        if (d2 != null) {
            a("Creating direct connection to: " + this);
            a(this.e.getRemoteDevice(d2).connectGatt(this.f, false, this.A));
            e(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.o = 0;
        d(false);
        a(false);
        b(false);
        int i = 0;
        while (true) {
            i<byte[], String> poll = this.x.poll();
            if (poll == null) {
                a(String.format("Disconnecting from %s with %d pending commands", this, Integer.valueOf(i)));
                return;
            } else {
                this.f5181d.a(false, "PHONE_KEY_NOT_CONNECTED", g.a(poll.f469a), this);
                i++;
            }
        }
    }

    public void k() {
        s();
        this.f5181d.c(this);
        BluetoothGatt m = m();
        if (m != null) {
            try {
                try {
                    this.v = true;
                    m.disconnect();
                    m.close();
                    a(String.format("Disconnected Gatt object from %s", this));
                } catch (Exception e) {
                    a("Failed to disconnect Gatt object", e);
                }
            } finally {
                a((BluetoothGatt) null);
            }
        } else {
            a(String.format("Gatt object on %s already null!", this));
        }
        t();
    }

    public void b(boolean z) {
        this.w = z;
    }

    public void c(boolean z) {
        if (this.y != z) {
            this.y = z;
            if (z) {
                l().postDelayed(this.z, (long) (Math.random() * 1000.0d));
            } else {
                l().removeCallbacks(this.z);
            }
        }
    }

    /* compiled from: Peripheral.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f5189a = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.m() == null || !c.this.b()) {
                c.this.a(String.format("Not connected to %s - cancelling service discovery", c.this));
            } else if (c.this.f()) {
            } else {
                this.f5189a++;
                if (!c.this.m().discoverServices()) {
                    this.f5189a = 5;
                }
                c.this.u.set(true);
                if (this.f5189a <= 4) {
                    c.this.a(String.format("Looking for services on %s", c.this));
                    c.this.l().postAtTime(this, c.this.d(), SystemClock.uptimeMillis() + 10000);
                    return;
                }
                c.this.a(String.format("Exceeded max retries of %s for finding services on %s", 4, c.this), (Exception) null);
                c.this.f5181d.f(c.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        l().removeCallbacksAndMessages(d());
        l().postAtTime(new Runnable() { // from class: com.teslamotors.plugins.ble.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                boolean b2 = c.this.b();
                boolean q = c.this.q();
                if (c.this.d() == null || b2 || q) {
                    c.this.a(String.format("Unable to reconnect to %s - isConnected: %s inProgress: %s", c.this, Boolean.valueOf(b2), Boolean.valueOf(q)));
                } else if (c.this.m() != null) {
                    if (c.this.m().connect()) {
                        c.this.a(String.format("Setting up long connect to %s via mGatt.connect()", c.this));
                    } else {
                        c.this.a(String.format("Failed to setting up long connect to %s via mGatt.connect()", c.this), (Exception) null);
                    }
                    c.this.e(false);
                } else {
                    c.this.j();
                }
            }
        }, d(), b(i) + SystemClock.uptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.t != null) {
            this.t.quitSafely();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f5181d.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Exception exc) {
        this.f5181d.a(str, exc);
    }
}
