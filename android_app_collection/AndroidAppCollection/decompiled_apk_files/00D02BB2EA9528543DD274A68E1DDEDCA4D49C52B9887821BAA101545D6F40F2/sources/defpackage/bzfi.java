package defpackage;

import com.google.android.apps.gmm.replay.events.LoggedObjectDiffEvent;
import com.google.android.filament.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bzfi  reason: default package */
/* loaded from: classes4.dex */
public final class bzfi<T> extends btrh<T> {
    private final int d;

    public bzfi(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String str;
        bnws bnwsVar;
        Object obj2;
        byte[] byteArray;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        byte[] bArr;
        int i = this.d;
        boolean z = false;
        if (i == 0) {
            bzfg bzfgVar = (bzfg) this.a;
            bzfgVar.q = true;
            if (!((crhr) obj).a()) {
                bzfgVar.o(bzdd.d);
            }
            byzk byzkVar = bzfgVar.f;
            if (byzkVar.t == null) {
                z = true;
            }
            dbsk.m(z, "Cannot start new AR navigation session when there is an existing session.");
            byzkVar.u++;
            byzkVar.t = Long.valueOf(byzkVar.a.e());
            bzfgVar.q();
        } else if (i == 1) {
            bzfg bzfgVar2 = (bzfg) this.a;
            crhs crhsVar = (crhs) obj;
            bzfgVar2.q = false;
            byzk byzkVar2 = bzfgVar2.f;
            if (byzkVar2.t != null) {
                z = true;
            }
            dbsk.m(z, "Cannot stop AR navigation session as there is no session.");
            byzkVar2.c();
            bzfgVar2.q();
        } else if (i == 2) {
            bzfg bzfgVar3 = (bzfg) this.a;
            if (!((ahju) obj).b) {
                bzfgVar3.f.b(bzfgVar3.r());
                bzfgVar3.u = Long.MIN_VALUE;
                bzfgVar3.w = true;
                bzfgVar3.q();
            } else if (!bzfgVar3.w || bzfgVar3.u != Long.MIN_VALUE) {
            } else {
                bzfgVar3.u = bzfgVar3.m.b();
                bzfgVar3.s();
            }
        } else {
            bzfg bzfgVar4 = (bzfg) this.a;
            LoggedObjectDiffEvent loggedObjectDiffEvent = (LoggedObjectDiffEvent) obj;
            if (!loggedObjectDiffEvent.getMessageName().equals("gmm.triptracker.update.DirectionsStorageItem")) {
                return;
            }
            try {
                bnwu bnwuVar = bzfgVar4.n;
                str = loggedObjectDiffEvent.messageName;
                byte[] encodedDiffBytes = loggedObjectDiffEvent.getEncodedDiffBytes();
                int sequenceNo = loggedObjectDiffEvent.getSequenceNo();
                synchronized (bnwuVar.a) {
                    bnwsVar = bnwuVar.a.get(str);
                    if (bnwsVar == null) {
                        bnwsVar = new bnws();
                        bnwuVar.a.put(str, bnwsVar);
                    }
                }
                synchronized (bnwsVar) {
                    int i2 = bnwsVar.b;
                    obj2 = null;
                    if (sequenceNo == i2) {
                        byteArray = bnwsVar.a;
                    } else {
                        if (sequenceNo == 1) {
                            bnwsVar.b = 0;
                            bArr = LoggedObjectDiffEvent.EMPTY_BYTES;
                            bnwsVar.a = bArr;
                        } else {
                            int i3 = i2 + 1;
                            if (sequenceNo != i3) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_tooltipForegroundColor);
                                sb.append("Attempting to decode out of sequence messageName: ");
                                sb.append(str);
                                sb.append(" expected sequenceNo: ");
                                sb.append(sequenceNo);
                                sb.append(" actual sequenceNo: ");
                                sb.append(i3);
                                throw new bnwt(sb.toString());
                            }
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(1024);
                        byte[] array = allocate.array();
                        try {
                            byte[] bArr2 = bnwsVar.a;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(encodedDiffBytes);
                            dxes dxesVar = new dxes(ByteBuffer.wrap(bArr2));
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            DataInputStream dataInputStream3 = new DataInputStream(byteArrayInputStream);
                            if (dataInputStream3.readUnsignedByte() != 209 || dataInputStream3.readUnsignedByte() != 255 || dataInputStream3.readUnsignedByte() != 209 || dataInputStream3.readUnsignedByte() != 255 || dataInputStream3.readUnsignedByte() != 4) {
                                throw new dxeu(null);
                            }
                            while (true) {
                                int readUnsignedByte = dataInputStream3.readUnsignedByte();
                                if (readUnsignedByte == 0) {
                                    dataOutputStream.flush();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    bnwsVar.a = byteArray;
                                    bnwsVar.b++;
                                } else if (readUnsignedByte <= 246) {
                                    dxet.a(readUnsignedByte, dataInputStream3, dataOutputStream, array);
                                } else {
                                    switch (readUnsignedByte) {
                                        case 247:
                                            dataInputStream2 = dataInputStream3;
                                            dxet.a(dataInputStream2.readUnsignedShort(), dataInputStream2, dataOutputStream, array);
                                            dataInputStream3 = dataInputStream2;
                                            break;
                                        case 248:
                                            DataInputStream dataInputStream4 = dataInputStream3;
                                            dataInputStream2 = dataInputStream4;
                                            dxet.a(dataInputStream4.readInt(), dataInputStream2, dataOutputStream, array);
                                            dataInputStream3 = dataInputStream2;
                                            break;
                                        case 249:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedByte(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 250:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 251:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readUnsignedShort(), dataInputStream.readInt(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 252:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readInt(), dataInputStream.readUnsignedByte(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 253:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readInt(), dataInputStream.readUnsignedShort(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 254:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream.readInt(), dataInputStream.readInt(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        case 255:
                                            dataInputStream = dataInputStream3;
                                            dxet.b(dataInputStream3.readLong(), dataInputStream3.readInt(), dxesVar, dataOutputStream, allocate);
                                            dataInputStream3 = dataInputStream;
                                            break;
                                        default:
                                            throw new IllegalStateException("command " + readUnsignedByte);
                                    }
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                if (byteArray != null) {
                    try {
                        obj2 = new ObjectInputStream(new ByteArrayInputStream(byteArray)).readObject();
                    } catch (IOException | ClassNotFoundException unused) {
                    }
                }
                amte amteVar = (amte) obj2;
                if (amteVar == null) {
                    return;
                }
                bzfgVar4.f(amteVar);
            } catch (bnwt unused2) {
            }
        }
    }
}
