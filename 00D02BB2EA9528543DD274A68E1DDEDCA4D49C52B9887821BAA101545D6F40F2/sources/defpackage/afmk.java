package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afmk  reason: default package */
/* loaded from: classes2.dex */
public final class afmk implements Runnable {
    final /* synthetic */ durd a;
    final /* synthetic */ dpuk b;
    final /* synthetic */ afml c;

    public afmk(afml afmlVar, durd durdVar, dpuk dpukVar) {
        this.c = afmlVar;
        this.a = durdVar;
        this.b = dpukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        durd durdVar = this.a;
        if (durdVar == null || (durdVar.a & 1) == 0) {
            return;
        }
        dijk dijkVar = durdVar.b;
        if (dijkVar == null) {
            dijkVar = dijk.c;
        }
        if ((dijkVar.a & 2) == 0) {
            afml afmlVar = this.c;
            if (this.b != dpuk.MAJOR_EVENT) {
                return;
            }
            cztq a = cztt.a(afmlVar.c);
            a.d(cztr.LONG);
            a.c = afmlVar.a.getString(R.string.UNABLE_TO_FIND_EVENT_TOAST);
            a.c();
            return;
        }
        dijk dijkVar2 = this.a.b;
        if (dijkVar2 == null) {
            dijkVar2 = dijk.c;
        }
        diwb diwbVar = dijkVar2.b;
        if (diwbVar == null) {
            diwbVar = diwb.U;
        }
        dpuk dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        if (this.b.ordinal() != 1) {
            return;
        }
        aagc a2 = this.c.b.a();
        String str = diwbVar.c;
        dpuk b = dpuk.b(diwbVar.d);
        if (b == null) {
            b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        a2.b(str, b, diwbVar, 1);
    }
}
