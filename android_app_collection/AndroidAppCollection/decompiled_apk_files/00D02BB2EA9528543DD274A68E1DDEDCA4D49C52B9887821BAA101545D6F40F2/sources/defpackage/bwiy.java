package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwiy  reason: default package */
/* loaded from: classes4.dex */
public final class bwiy {
    public final dtja a;
    private final bwnl b;
    @dzsi
    private final String c;
    @dzsi
    private final akqi d;

    public bwiy(dtja dtjaVar, bwnl bwnlVar, @dzsi String str, @dzsi akqi akqiVar) {
        this.a = dtjaVar;
        this.b = bwnlVar;
        this.c = str;
        this.d = akqiVar;
    }

    public static bwiy a(dtja dtjaVar, bwno bwnoVar) {
        bwnl bwnlVar;
        String str;
        dtnd dtndVar = bwnoVar.a.b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        if ((dtndVar.a & 1024) != 0) {
            bwnlVar = new bwnl(dtndVar.i);
        } else {
            bwnlVar = bwnl.a;
        }
        dtjb dtjbVar = dtndVar.e;
        if (dtjbVar == null) {
            dtjbVar = dtjb.h;
        }
        akqi akqiVar = null;
        if ((dtjbVar.a & 4) != 0) {
            dtjb dtjbVar2 = dtndVar.e;
            if (dtjbVar2 == null) {
                dtjbVar2 = dtjb.h;
            }
            str = dtjbVar2.e;
        } else {
            str = null;
        }
        dtox dtoxVar = dtndVar.g;
        if (dtoxVar == null) {
            dtoxVar = dtox.c;
        }
        if ((dtoxVar.a & 2) != 0) {
            dtox dtoxVar2 = dtndVar.g;
            if (dtoxVar2 == null) {
                dtoxVar2 = dtox.c;
            }
            dgrh dgrhVar = dtoxVar2.b;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            akqiVar = akqi.k(dgrhVar);
        }
        return new bwiy(dtjaVar, bwnlVar, str, akqiVar);
    }

    public final boolean b() {
        return this.a != dtja.INVALID_UI_TYPE;
    }

    public final boolean c() {
        return this.b.b == null && this.c == null && this.d == null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bwiy) {
            bwiy bwiyVar = (bwiy) obj;
            if (this.a == bwiyVar.a && this.b.equals(bwiyVar.b) && dbsd.a(this.c, bwiyVar.c) && dbsd.a(this.d, bwiyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("uiType", this.a);
        b.b("requestToken", this.b);
        b.b("obfuscatedGaiaId", this.c);
        b.b("searchContextFeatureId", this.d);
        return b.toString();
    }
}
