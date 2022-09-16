package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aowk  reason: default package */
/* loaded from: classes2.dex */
public class aowk implements aowi {
    private final Resources b;
    private final apii c;
    private final aphn d;
    private final aphj e;
    private final bwrs<aoyg> f;
    private final List<aoxt> g;
    private final aoyk h;

    public aowk(Resources resources, apii apiiVar, aphy aphyVar, aphj aphjVar, final bwrs<aoyg> bwrsVar, List<aoxt> list, aoyk aoykVar) {
        this.b = resources;
        this.c = apiiVar;
        this.d = aphyVar.a(new Callable(bwrsVar) { // from class: aowj
            private final bwrs a;

            {
                this.a = bwrsVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a;
            }
        });
        this.e = aphjVar;
        this.f = bwrsVar;
        this.g = list;
        this.h = aoykVar;
    }

    @Override // defpackage.aowi
    public aphq a() {
        return this.c.a(this.f, this.g, cjtd.a(dtyi.ab), this.h);
    }

    @Override // defpackage.aowi
    public aphn b() {
        return this.d;
    }

    @Override // defpackage.aphw
    public CharSequence c() {
        return this.e.b(this.g.size(), 2);
    }

    @Override // defpackage.aphw
    public Boolean d() {
        return true;
    }

    @Override // defpackage.aphw
    public CharSequence e() {
        if (!((aowf) this.h).al.booleanValue()) {
            return this.b.getString(R.string.SEARCH_SORT_BY);
        }
        return aoxs.a(this.b, ((aowf) this.h).am);
    }

    @Override // defpackage.aphw
    public CharSequence f() {
        return this.e.a(((aowf) this.h).al.booleanValue(), ((aowf) this.h).am);
    }

    @Override // defpackage.aphw
    public cqkl g() {
        this.h.aR();
        return cqkl.a;
    }

    @Override // defpackage.aphw
    public Boolean h() {
        return true;
    }
}
