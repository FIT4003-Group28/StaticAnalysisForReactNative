package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
@axkh(b = {3})
/* renamed from: axki  reason: default package */
/* loaded from: classes2.dex */
public final class axki extends axkc {
    private static final Logger m = Logger.getLogger(axki.class.getName());
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String g;
    public int h;
    public int i;
    public axkf j;
    public axko k;
    public int f = 0;
    public final List l = new ArrayList();

    @Override // defpackage.axkc
    public final void a(ByteBuffer byteBuffer) {
        axki axkiVar = this;
        axkiVar.a = hy.F(byteBuffer);
        int H = hy.H(byteBuffer);
        int i = H >>> 7;
        axkiVar.b = i;
        axkiVar.c = (H >>> 6) & 1;
        axkiVar.d = (H >>> 5) & 1;
        axkiVar.e = H & 31;
        if (i == 1) {
            axkiVar.h = hy.F(byteBuffer);
        }
        if (axkiVar.c == 1) {
            int H2 = hy.H(byteBuffer);
            axkiVar.f = H2;
            axkiVar.g = hy.M(byteBuffer, H2);
        }
        if (axkiVar.d == 1) {
            axkiVar.i = hy.F(byteBuffer);
        }
        int i2 = 0;
        int i3 = axkiVar.V + 4 + (1 != axkiVar.b ? 0 : 2) + (axkiVar.c == 1 ? axkiVar.f + 1 : 0);
        if (1 == axkiVar.d) {
            i2 = 2;
        }
        int i4 = i3 + i2;
        int position = byteBuffer.position();
        if (c() > i4 + 2) {
            axkc a = axkm.a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = m;
            Level level = Level.FINER;
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(a != null ? Integer.valueOf(a.c()) : null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(position2);
            sb.append(", size: ");
            sb.append(valueOf2);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb.toString());
            if (a != null) {
                int c = a.c();
                byteBuffer.position(position + c);
                i4 += c;
            } else {
                i4 = (int) (i4 + position2);
            }
            if (a instanceof axkf) {
                axkiVar.j = (axkf) a;
            }
        }
        int position3 = byteBuffer.position();
        if (c() > i4 + 2) {
            axkc a2 = axkm.a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = m;
            Level level2 = Level.FINER;
            String valueOf3 = String.valueOf(a2);
            String valueOf4 = String.valueOf(a2 != null ? Integer.valueOf(a2.c()) : null);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 51 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(position4);
            sb2.append(", size: ");
            sb2.append(valueOf4);
            logger2.logp(level2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb2.toString());
            if (a2 != null) {
                int c2 = a2.c();
                byteBuffer.position(position3 + c2);
                i4 += c2;
            } else {
                i4 = (int) (i4 + position4);
            }
            if (a2 instanceof axko) {
                axkiVar = this;
                axkiVar.k = (axko) a2;
            } else {
                axkiVar = this;
            }
        } else {
            m.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", "SLConfigDescriptor is missing!");
        }
        while (c() - i4 > 2) {
            int position5 = byteBuffer.position();
            axkc a3 = axkm.a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = m;
            Level level3 = Level.FINER;
            String valueOf5 = String.valueOf(a3);
            String valueOf6 = String.valueOf(a3 != null ? Integer.valueOf(a3.c()) : null);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 51 + String.valueOf(valueOf6).length());
            sb3.append(valueOf5);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(position6);
            sb3.append(", size: ");
            sb3.append(valueOf6);
            logger3.logp(level3, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb3.toString());
            if (a3 != null) {
                int c3 = a3.c();
                byteBuffer.position(position5 + c3);
                i4 += c3;
            } else {
                i4 = (int) (i4 + position6);
            }
            axkiVar.l.add(a3);
        }
    }

    public final int b() {
        int i = 1 != this.b ? 5 : 7;
        if (this.c > 0) {
            i += this.f + 1;
        }
        if (this.d > 0) {
            i += 2;
        }
        return i + this.j.b() + 3;
    }

    public final ByteBuffer d() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        hy.z(allocate, 3);
        hy.z(allocate, b() - 2);
        hy.w(allocate, this.a);
        hy.z(allocate, (this.b << 7) | (this.c << 6) | (this.d << 5) | this.e);
        if (this.b > 0) {
            hy.w(allocate, this.h);
        }
        if (this.c > 0) {
            hy.z(allocate, this.f);
            allocate.put(hx.k(this.g));
            hy.z(allocate, 0);
        }
        if (this.d > 0) {
            hy.w(allocate, this.i);
        }
        axkf axkfVar = this.j;
        ByteBuffer allocate2 = ByteBuffer.allocate(axkfVar.b());
        hy.z(allocate2, 4);
        hy.z(allocate2, axkfVar.b() - 2);
        hy.z(allocate2, axkfVar.a);
        int i = axkfVar.b;
        int i2 = axkfVar.c;
        hy.z(allocate2, (i << 2) | (i2 + i2) | 1);
        hy.x(allocate2, axkfVar.d);
        hy.y(allocate2, axkfVar.e);
        hy.y(allocate2, axkfVar.f);
        axkb axkbVar = axkfVar.h;
        if (axkbVar != null) {
            axkbVar.b();
            ByteBuffer allocate3 = ByteBuffer.allocate(4);
            hy.z(allocate3, 5);
            axkbVar.b();
            hy.z(allocate3, 2);
            axke axkeVar = new axke(allocate3);
            axkeVar.a(axkbVar.d, 5);
            axkeVar.a(axkbVar.e, 4);
            if (axkbVar.e == 15) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            axkeVar.a(axkbVar.g, 4);
            allocate2.put(allocate3.array());
        }
        axko axkoVar = this.k;
        ByteBuffer allocate4 = ByteBuffer.allocate(3);
        hy.z(allocate4, 6);
        hy.z(allocate4, 1);
        hy.z(allocate4, axkoVar.a);
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axki axkiVar = (axki) obj;
            if (this.c != axkiVar.c || this.f != axkiVar.f || this.h != axkiVar.h || this.a != axkiVar.a || this.i != axkiVar.i || this.d != axkiVar.d || this.b != axkiVar.b || this.e != axkiVar.e) {
                return false;
            }
            String str = this.g;
            if (str == null ? axkiVar.g != null : !str.equals(axkiVar.g)) {
                return false;
            }
            axkf axkfVar = this.j;
            if (axkfVar == null ? axkiVar.j != null : !axkfVar.equals(axkiVar.j)) {
                return false;
            }
            if (this.l.equals(axkiVar.l)) {
                axko axkoVar = this.k;
                return axkoVar == null ? axkiVar.k == null : axkoVar.equals(axkiVar.k);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31;
        String str = this.g;
        int i2 = 0;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 961) + this.h) * 31) + this.i) * 31;
        axkf axkfVar = this.j;
        int hashCode2 = (hashCode + (axkfVar != null ? axkfVar.hashCode() : 0)) * 31;
        axko axkoVar = this.k;
        if (axkoVar != null) {
            i2 = axkoVar.a;
        }
        return ((hashCode2 + i2) * 31) + this.l.hashCode();
    }

    @Override // defpackage.axkc
    public final String toString() {
        return "ESDescriptor{esId=" + this.a + ", streamDependenceFlag=" + this.b + ", URLFlag=" + this.c + ", oCRstreamFlag=" + this.d + ", streamPriority=" + this.e + ", URLLength=" + this.f + ", URLString='" + this.g + "', remoteODFlag=0, dependsOnEsId=" + this.h + ", oCREsId=" + this.i + ", decoderConfigDescriptor=" + this.j + ", slConfigDescriptor=" + this.k + '}';
    }
}
