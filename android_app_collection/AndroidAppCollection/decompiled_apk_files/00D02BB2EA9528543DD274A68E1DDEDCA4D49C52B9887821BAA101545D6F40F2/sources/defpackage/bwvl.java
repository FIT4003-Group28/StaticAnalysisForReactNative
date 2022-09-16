package defpackage;

import com.google.geo.imagery.viewer.api.IconHandle;
/* compiled from: PG */
/* renamed from: bwvl  reason: default package */
/* loaded from: classes4.dex */
public final class bwvl {
    public dhjz a = dhjz.e;
    @dzsi
    public IconHandle b;
    @dzsi
    public IconHandle c;
    @dzsi
    public dftz d;
    public final bunk e;

    public bwvl(dftz dftzVar, bunk bunkVar) {
        this.d = dftzVar;
        this.e = bunkVar;
        dfsp bZ = dfss.k.bZ();
        this.b = null;
        this.c = null;
        if (dftzVar == null || dftzVar.c()) {
            return;
        }
        this.b = dftzVar.d(2131232027L);
        this.c = dftzVar.d(2131233039L);
        if (this.b != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfss.b((dfss) bZ.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfss dfssVar = (dfss) bZ.b;
            dfssVar.a |= 512;
            dfssVar.h = 0.0f;
            IconHandle iconHandle = this.b;
            if (iconHandle != null) {
                dftzVar.b(iconHandle, bZ.bK());
            }
        }
        if (this.c == null) {
            return;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss.b((dfss) bZ.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss dfssVar2 = (dfss) bZ.b;
        dfssVar2.a |= 512;
        dfssVar2.h = 0.5f;
        IconHandle iconHandle2 = this.c;
        if (iconHandle2 == null) {
            return;
        }
        dftzVar.b(iconHandle2, bZ.bK());
    }

    public final void a() {
        dftz dftzVar = this.d;
        if (dftzVar == null || dftzVar.c()) {
            return;
        }
        if (this.b == null) {
            this.b = dftzVar.d(2131232027L);
        }
        if (this.c != null) {
            return;
        }
        this.c = dftzVar.d(2131233039L);
    }
}
