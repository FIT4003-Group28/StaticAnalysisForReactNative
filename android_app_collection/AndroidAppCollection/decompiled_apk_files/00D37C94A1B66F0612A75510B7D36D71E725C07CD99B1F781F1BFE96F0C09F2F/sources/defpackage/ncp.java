package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ncp  reason: default package */
/* loaded from: classes3.dex */
public final class ncp implements ajru {
    public final Context a;
    public final Resources b;
    public final ajmy c;
    public final ajyc d;
    public final aafo e;
    frf f;
    public aujm g;
    private final mww h;
    private final FrameLayout i;
    private nco j;
    private nco k;
    private nco l;
    private final aacz m;
    private int n;

    public ncp(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, tjv tjvVar, aacz aaczVar, enm enmVar) {
        this.a = context;
        this.b = context.getResources();
        ajmyVar.getClass();
        this.c = ajmyVar;
        this.d = ajycVar;
        aafoVar.getClass();
        this.e = aafoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        this.m = aaczVar;
        this.h = new mww(aafoVar, tjvVar, enmVar, frameLayout);
    }

    public static final void d(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r0 != r3) goto L136;
     */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncp.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.c();
    }
}
