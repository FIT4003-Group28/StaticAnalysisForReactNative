package defpackage;
/* compiled from: PG */
/* renamed from: tmb  reason: default package */
/* loaded from: classes4.dex */
public final class tmb {
    public static final tly d = new tly();
    public final tmt a;
    public tms b;
    public int c = -1;
    public final tly e;
    public final aopc f;

    public tmb(aopc aopcVar, tly tlyVar, tmt tmtVar) {
        this.f = aopcVar;
        this.e = tlyVar;
        this.a = tmtVar;
    }

    public final tmh a() {
        return (tmh) this.f.mo39build();
    }

    public final boolean b() {
        angf angfVar = ((tmh) this.f.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        return (angfVar.b & 8) != 0;
    }

    public final boolean c() {
        angf angfVar = ((tmh) this.f.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        return (angfVar.b & 2048) != 0;
    }

    public final int d() {
        return ((tml) this.b).h();
    }

    public final String toString() {
        String str;
        tms tmsVar = this.b;
        if (tmsVar != null) {
            String valueOf = String.valueOf(tmsVar.getClass().getSimpleName());
            str = valueOf.length() != 0 ? ".".concat(valueOf) : new String(".");
        } else {
            str = "";
        }
        angf angfVar = ((tmh) this.f.instance).d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        int i = angfVar.d;
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString).length());
        sb.append("CVE");
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append(" [");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }
}
