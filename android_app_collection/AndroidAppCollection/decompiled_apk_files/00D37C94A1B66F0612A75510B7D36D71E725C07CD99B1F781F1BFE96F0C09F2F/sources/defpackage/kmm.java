package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;
/* compiled from: PG */
/* renamed from: kmm  reason: default package */
/* loaded from: classes3.dex */
public final class kmm extends aizc implements aiau, aigm {
    public final FrameLayout a;
    private final aiba b;

    public kmm(Context context, kok kokVar, aadd aaddVar) {
        super(context);
        aiba aibaVar = new aiba(context);
        this.b = aibaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(aibaVar);
        addView(frameLayout);
        ayoi.m(aaddVar.a, kokVar.t().W(), eho.s).X(aypa.a()).as(new ayqb() { // from class: kml
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                zgd.t(kmm.this.a, zgd.k(((Integer) obj).intValue()), ViewGroup.MarginLayoutParams.class);
            }
        });
    }

    @Override // defpackage.aiau
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
    }

    @Override // defpackage.aiau
    public final void f() {
        this.b.f();
    }

    @Override // defpackage.aiau
    public final void g(float f) {
        this.b.g(f);
    }

    @Override // defpackage.aiau
    public final void h(int i, int i2) {
        this.b.h(i, 0);
    }

    @Override // defpackage.aiau
    public final void i(SubtitlesStyle subtitlesStyle) {
        this.b.i(subtitlesStyle);
    }

    @Override // defpackage.aiau
    public final void j(List list) {
        this.b.j(list);
    }

    @Override // defpackage.aizc, defpackage.aizf
    public final View kZ() {
        return this;
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        setVisibility(i2 == 2 ? 8 : 0);
    }
}
