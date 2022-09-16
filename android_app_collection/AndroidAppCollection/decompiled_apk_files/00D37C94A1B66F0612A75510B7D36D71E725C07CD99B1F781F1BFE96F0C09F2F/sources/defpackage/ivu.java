package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;
/* compiled from: PG */
/* renamed from: ivu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ivu implements View.OnClickListener {
    public final /* synthetic */ MdxSmartRemoteMealbarController a;
    public final /* synthetic */ adig b;
    private final /* synthetic */ int c;

    public /* synthetic */ ivu(MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController, adig adigVar) {
        this.a = mdxSmartRemoteMealbarController;
        this.b = adigVar;
    }

    public /* synthetic */ ivu(MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController, adig adigVar, int i) {
        this.c = i;
        this.a = mdxSmartRemoteMealbarController;
        this.b = adigVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController = this.a;
            mdxSmartRemoteMealbarController.c.R(this.b, new ivw(mdxSmartRemoteMealbarController));
            return;
        }
        final MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = this.a;
        final adig adigVar = this.b;
        mdxSmartRemoteMealbarController2.g.e(new afve() { // from class: ivv
            @Override // defpackage.afve
            public final void a() {
                MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController3 = MdxSmartRemoteMealbarController.this;
                mdxSmartRemoteMealbarController3.c.R(adigVar, new ivw(mdxSmartRemoteMealbarController3));
            }
        });
    }
}
