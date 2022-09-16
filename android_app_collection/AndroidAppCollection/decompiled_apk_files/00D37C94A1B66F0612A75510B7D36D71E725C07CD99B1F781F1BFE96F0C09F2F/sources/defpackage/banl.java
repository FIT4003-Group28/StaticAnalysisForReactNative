package defpackage;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: banl  reason: default package */
/* loaded from: classes2.dex */
public final class banl {
    private static balh a;

    public static final boolean a() {
        Logging.a("NativeLibrary", "Loading library: jingle_peerconnection_so");
        try {
            System.loadLibrary("jingle_peerconnection_so");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Logging.c("NativeLibrary", "Failed to load native library: jingle_peerconnection_so", e);
            return false;
        }
    }

    public static int b(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        d("generateTexture");
        return i2;
    }

    public static FloatBuffer c(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void d(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new bani(str);
            }
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(": GLES20 error: ");
            sb.append(glGetError);
            throw new GLException(glGetError, sb.toString());
        }
    }

    public static long e(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    public static baht f(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte == 70) {
                balz balzVar = new balz(str, dataInput.readUTF(), (int) e(dataInput), (int) e(dataInput));
                return balzVar.equals(baht.a) ? baht.a : balzVar;
            } else if (readUnsignedByte == 80) {
                return balw.o(dataInput, str);
            } else {
                throw new IOException("Invalid encoding");
            }
        }
        return new balt(balw.o(dataInput, str));
    }

    public static balh g() {
        baln balnVar;
        if (a == null) {
            balp balpVar = new balp();
            ball ballVar = new ball("P");
            balpVar.d(ballVar, ballVar);
            balpVar.b(0);
            balpVar.i("Y");
            balpVar.b(1);
            balpVar.i("M");
            balpVar.b(2);
            balpVar.i("W");
            balpVar.b(3);
            balpVar.i("D");
            List list = balpVar.b;
            if (list.size() == 0) {
                baln balnVar2 = new baln(ball.a);
                balpVar.d(balnVar2, balnVar2);
            } else {
                int size = list.size();
                while (true) {
                    int i = size - 1;
                    if (i < 0) {
                        balnVar = null;
                        break;
                    } else if (list.get(i) instanceof baln) {
                        balnVar = (baln) list.get(i);
                        list = list.subList(i + 1, list.size());
                        break;
                    } else {
                        size = i - 1;
                    }
                }
                if (balnVar == null || list.size() != 0) {
                    Object[] c = balp.c(list);
                    list.clear();
                    balq balqVar = (balq) c[1];
                    baln balnVar3 = new baln((balr) c[0]);
                    list.add(balnVar3);
                    list.add(balnVar3);
                } else {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
            }
            balpVar.e();
            balpVar.i("H");
            balpVar.f();
            balpVar.i("M");
            balpVar.b(9);
            balpVar.i("S");
            a = balpVar.a();
        }
        return a;
    }

    public static final void h(azvb azvbVar, azqy azqyVar, boolean z) {
        Object b = ((azub) azvbVar).b();
        Throwable e = azvbVar.e(b);
        Object p = e != null ? azqj.p(e) : azvbVar.c(b);
        if (z) {
            azxp azxpVar = (azxp) azqyVar;
            azqy azqyVar2 = azxpVar.b;
            Object obj = azxpVar.d;
            azrd context = azqyVar2.getContext();
            Object b2 = azyi.b(context, obj);
            if (b2 != azyi.a) {
                azup.c(azqyVar2, context);
            }
            try {
                azxpVar.b.resumeWith(p);
                return;
            } finally {
                azyi.c(context, b2);
            }
        }
        azqyVar.resumeWith(p);
    }

    public static final boolean i(int i) {
        return i == 1 || i == 2;
    }

    public static final String j(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String l(azqy azqyVar) {
        String str;
        if (azqyVar instanceof azxp) {
            return azqyVar.toString();
        }
        try {
            str = azqyVar + '@' + k(azqyVar);
        } catch (Throwable th) {
            str = azqj.p(th);
        }
        Throwable a2 = azqh.a(str);
        String str2 = str;
        if (a2 != null) {
            str2 = ((Object) azqyVar.getClass().getName()) + '@' + k(azqyVar);
        }
        return (String) str2;
    }

    public static aypg m() {
        return o(ayrb.b);
    }

    public static aypg n(aypv aypvVar) {
        ayrd.b(aypvVar, "run is null");
        return new aype(aypvVar);
    }

    public static aypg o(Runnable runnable) {
        ayrd.b(runnable, "run is null");
        return new aypi(runnable);
    }

    public static final aydn p(int i) {
        return new aydn(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
