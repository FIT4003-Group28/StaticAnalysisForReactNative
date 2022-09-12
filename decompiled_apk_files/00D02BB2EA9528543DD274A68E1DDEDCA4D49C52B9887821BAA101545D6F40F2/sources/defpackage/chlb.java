package defpackage;
/* compiled from: PG */
/* renamed from: chlb  reason: default package */
/* loaded from: classes4.dex */
public class chlb implements chmx {
    private final String a;
    private final boolean b;
    private final int c;

    public chlb(String str, djvc djvcVar, djvc djvcVar2) {
        this.a = str;
        if (djvcVar == djvc.MAJOR_TYPE) {
            this.b = true;
            int ordinal = djvcVar2.ordinal();
            if (ordinal == 0) {
                this.c = 28;
                return;
            } else if (ordinal != 2) {
                this.c = 0;
                return;
            } else {
                this.c = 40;
                return;
            }
        }
        this.b = false;
        int ordinal2 = djvcVar2.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1) {
            this.c = 40;
        } else {
            this.c = 15;
        }
    }

    @Override // defpackage.chmx
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.chmx
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.chmx
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.chmx
    public cqss d() {
        if (this.b) {
            return irg.a();
        }
        return irg.O();
    }
}
