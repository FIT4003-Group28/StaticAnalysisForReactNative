package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: uij  reason: default package */
/* loaded from: classes4.dex */
public final class uij implements uii {
    private final uhj b;
    private final Context c;
    private final uck d;
    private final snc e;
    private final ues f;

    public uij(uhj uhjVar, Context context, ucj ucjVar, ues uesVar, snc sncVar) {
        this.b = uhjVar;
        this.c = context;
        this.d = ucjVar.d;
        this.f = uesVar;
        this.e = sncVar;
    }

    static float c(float f, Context context) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    static int d(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    private final void e(RemoteViews remoteViews, int i, String str, ucw ucwVar) {
        aolz aolzVar = ucwVar.d;
        if ((aolzVar.b & 8192) != 0) {
            remoteViews.setInt(i, str, aolzVar.q);
        } else if (this.d.c == null) {
        } else {
            remoteViews.setInt(i, str, this.c.getResources().getColor(this.d.c.intValue()));
        }
    }

    @Override // defpackage.uii
    public final ucw a(ucw ucwVar) {
        if (uid.e(this.c)) {
            return ucwVar;
        }
        uco ucoVar = new uco(ucwVar);
        ucoVar.d(ucwVar.a);
        return ucoVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    @Override // defpackage.uii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.ucp r24, defpackage.ucw r25, defpackage.fi r26, defpackage.ampq r27, defpackage.ubz r28) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uij.b(ucp, ucw, fi, ampq, ubz):boolean");
    }
}
