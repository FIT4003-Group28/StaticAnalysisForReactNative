package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwpv  reason: default package */
/* loaded from: classes4.dex */
public class bwpv implements bwoe {
    private final Activity a;
    private final eeu b;
    private final dzsj<avik> c;
    private final List<jbf> d;
    private final boolean e;

    public bwpv(Activity activity, eeu eeuVar, dzsj<avik> dzsjVar, List<jbf> list, boolean z) {
        this.a = activity;
        this.b = eeuVar;
        this.c = dzsjVar;
        this.d = list;
        this.e = z;
    }

    @Override // defpackage.bwoe
    public List<jbf> a() {
        return this.d.size() > 3 ? this.d.subList(0, 3) : this.d;
    }

    @Override // defpackage.bwoe
    public CharSequence b() {
        if (this.e) {
            return this.a.getString(R.string.OFFLINE_MAPS_TITLE);
        }
        return this.a.getResources().getQuantityString(R.plurals.OFFLINE_MAPS_CARD_TITLE, this.d.size(), Integer.valueOf(this.d.size()));
    }

    @Override // defpackage.bwoe
    public cqkl c() {
        if (!this.b.b()) {
            return cqkl.a;
        }
        this.c.a().j();
        return cqkl.a;
    }

    @Override // defpackage.bwoe
    public Boolean d() {
        return Boolean.valueOf(this.e);
    }
}
