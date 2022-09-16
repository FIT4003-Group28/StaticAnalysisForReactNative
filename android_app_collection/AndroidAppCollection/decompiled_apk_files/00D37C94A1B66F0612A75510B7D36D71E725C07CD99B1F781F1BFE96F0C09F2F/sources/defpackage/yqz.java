package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: yqz  reason: default package */
/* loaded from: classes4.dex */
public final class yqz {
    public static final yqz a;
    public InputStream b;
    private final String c;
    private final String d;
    private ArrayList e;
    private ByteBuffer f;
    private byte[] g;

    static {
        yqz yqzVar = new yqz(null, Integer.toString(0));
        yqzVar.g = new byte[0];
        a = yqzVar;
    }

    public yqz(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public static yqz i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        yqz yqzVar = new yqz(null, Long.toString(j(arrayList)));
        yqzVar.e = arrayList;
        return yqzVar;
    }

    private static long j(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((ByteBuffer) arrayList.get(i)).remaining();
        }
        return j;
    }

    private final synchronized void k() {
        yuo yuoVar;
        if (this.b != null) {
            long j = -1;
            if (!TextUtils.isEmpty(this.d)) {
                try {
                    j = Long.parseLong(this.d);
                } catch (NumberFormatException unused) {
                }
            }
            if (j >= 0) {
                yuoVar = new yuo((int) Math.min(j, 1048576L));
            } else {
                yuoVar = new yuo();
            }
            byte[] bArr = new byte[2048];
            while (true) {
                int read = this.b.read(bArr);
                if (read != -1) {
                    yuoVar.write(bArr, 0, read);
                } else {
                    this.b.close();
                    this.b = null;
                    this.f = yuoVar.a();
                    return;
                }
            }
        }
    }

    public final synchronized long a() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr.length;
        }
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer.remaining();
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return j(arrayList);
        }
        String str = this.d;
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public final synchronized InputStream b() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream;
        }
        return new yun(e());
    }

    public final synchronized String c() {
        return h();
    }

    public final synchronized ByteBuffer d() {
        ByteBuffer e = e();
        if (e.hasArray()) {
            return e;
        }
        return ByteBuffer.wrap(g());
    }

    public final synchronized ByteBuffer e() {
        k();
        byte[] bArr = this.g;
        if (bArr != null) {
            return ByteBuffer.wrap(bArr);
        }
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer.duplicate();
        }
        aqxo.y(this.e != null);
        if (this.e.isEmpty()) {
            byte[] bArr2 = new byte[0];
            this.g = bArr2;
            this.e = null;
            return ByteBuffer.wrap(bArr2);
        } else if (this.e.size() == 1) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.e.get(0);
            this.f = byteBuffer2;
            this.e = null;
            return byteBuffer2.duplicate();
        } else {
            long j = j(this.e);
            if (j > 2147483647L) {
                throw new IOException("Body too big");
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            for (int i = 0; i < this.e.size(); i++) {
                allocate.put((ByteBuffer) this.e.get(i));
            }
            this.e = null;
            byte[] array = allocate.array();
            this.g = array;
            return ByteBuffer.wrap(array);
        }
    }

    public final synchronized void f() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.b = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final synchronized byte[] g() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        ByteBuffer e = e();
        if (e.hasArray() && e.arrayOffset() == 0) {
            byte[] array = e.array();
            if (e.limit() == array.length) {
                this.g = array;
                return array;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(e.remaining());
        allocate.put(e);
        byte[] array2 = allocate.array();
        this.g = array2;
        this.f = null;
        return array2;
    }

    public final synchronized String h() {
        byte[] array;
        int arrayOffset;
        int remaining;
        String str;
        ByteBuffer d = d();
        array = d.array();
        arrayOffset = d.arrayOffset() + d.position();
        remaining = d.remaining();
        str = null;
        String str2 = !TextUtils.isEmpty(this.c) ? (String) new yqq(this.c).a.get("charset".toLowerCase(Locale.ENGLISH)) : null;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (true == TextUtils.isEmpty(str)) {
            str = "ISO-8859-1";
        }
        return new String(array, arrayOffset, remaining, str);
    }
}
