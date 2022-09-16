package defpackage;

import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iyy  reason: default package */
/* loaded from: classes3.dex */
public final class iyy implements adny {
    final /* synthetic */ iza a;

    public iyy(iza izaVar) {
        this.a = izaVar;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        this.a.b();
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.setVisibility(0);
        }
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        this.a.b();
        this.a.e(false);
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.setVisibility(8);
        }
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }
}
