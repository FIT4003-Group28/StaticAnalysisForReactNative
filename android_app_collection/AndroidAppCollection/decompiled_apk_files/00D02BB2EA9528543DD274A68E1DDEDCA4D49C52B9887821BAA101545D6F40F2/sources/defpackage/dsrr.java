package defpackage;
/* compiled from: PG */
/* renamed from: dsrr  reason: default package */
/* loaded from: classes.dex */
public class dsrr {
    protected volatile dssj a;
    public volatile dspd b;

    static {
        dsqa.b();
    }

    public final dspd b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = dspd.b;
            } else {
                this.b = this.a.bR();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsrr)) {
            return false;
        }
        dsrr dsrrVar = (dsrr) obj;
        dssj dssjVar = this.a;
        dssj dssjVar2 = dsrrVar.a;
        if (dssjVar == null && dssjVar2 == null) {
            return b().equals(dsrrVar.b());
        }
        if (dssjVar != null && dssjVar2 != null) {
            return dssjVar.equals(dssjVar2);
        }
        if (dssjVar != null) {
            return dssjVar.equals(dsrrVar.a(dssjVar.Qw()));
        }
        return a(dssjVar2.Qw()).equals(dssjVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final dssj a(dssj dssjVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = dssjVar;
                        this.b = dspd.b;
                    } catch (dsrm unused) {
                        this.a = dssjVar;
                        this.b = dspd.b;
                    }
                }
            }
        }
        return this.a;
    }
}
