package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: re  reason: default package */
/* loaded from: classes.dex */
public final class re implements Runnable {
    final /* synthetic */ rv a;

    public re(rv rvVar) {
        this.a = rvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rv rvVar = this.a;
        if ((rvVar.F & 1) != 0) {
            rvVar.I(0);
        }
        rv rvVar2 = this.a;
        if ((rvVar2.F & 4096) != 0) {
            rvVar2.I(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        rv rvVar3 = this.a;
        rvVar3.E = false;
        rvVar3.F = 0;
    }
}
