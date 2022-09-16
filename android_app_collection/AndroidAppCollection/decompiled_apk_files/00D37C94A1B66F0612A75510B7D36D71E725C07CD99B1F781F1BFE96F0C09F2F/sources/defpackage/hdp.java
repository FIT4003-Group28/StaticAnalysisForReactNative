package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hdp  reason: default package */
/* loaded from: classes3.dex */
public final class hdp extends zxr {
    final /* synthetic */ Context a;
    final /* synthetic */ List b;
    final /* synthetic */ hdq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdp(hdq hdqVar, Context context, eo eoVar, acti actiVar, Context context2, List list) {
        super(context, eoVar, actiVar, true, true);
        this.c = hdqVar;
        this.a = context2;
        this.b = list;
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.c.b;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.a.getString(R.string.shorts_filter_presets_title);
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void f() {
        super.f();
        for (View view : this.b) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
        ChooseFilterView chooseFilterView = this.c.b;
        if (chooseFilterView == null) {
            return;
        }
        if (chooseFilterView.f) {
            chooseFilterView.k();
        }
        this.c.c();
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final void g() {
        actj actjVar;
        hdq hdqVar = this.c;
        gyq gyqVar = hdqVar.h;
        if (gyqVar != null && (actjVar = hdqVar.i) != null) {
            gyo a = gyqVar.a(actjVar);
            a.h(true);
            a.a();
        }
        for (View view : this.b) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
        ChooseFilterView chooseFilterView = this.c.b;
        if (chooseFilterView == null) {
            return;
        }
        if (!chooseFilterView.f) {
            chooseFilterView.k();
            ChooseFilterView chooseFilterView2 = this.c.b;
            if (chooseFilterView2 != null && (chooseFilterView2.c() == null || !this.c.b.c().r())) {
                if (this.c.c != null) {
                    afus.b(1, 24, "[ShortsCreation][Android][Camera]Opened empty preset drawer");
                }
                if (this.c.e != null) {
                    afus.b(1, 24, "[ShortsCreation][Android][Edit]Opened empty preset drawer");
                }
            }
        }
        this.c.c();
        super.g();
    }

    @Override // defpackage.zxr
    protected final boolean h() {
        return false;
    }

    @Override // defpackage.zxr
    protected final View lN() {
        return this.c.f;
    }

    @Override // defpackage.zxr
    protected final actj lR() {
        return null;
    }
}
