package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bksk  reason: default package */
/* loaded from: classes3.dex */
public class bksk implements bkrw {
    private final Activity b;
    private final cjtd c = cjtd.a(dtxy.nM);
    private final bksj d;
    private final int e;
    private final String f;

    public bksk(Activity activity, cqhn cqhnVar, cqhu cqhuVar, int i, bksj bksjVar) {
        this.b = activity;
        this.d = bksjVar;
        this.e = i;
        this.f = activity.getResources().getQuantityString(R.plurals.TOPIC_EXPANDER_DESCRIPTION, i, Integer.valueOf(i));
    }

    @Override // defpackage.bkrw
    public cqtd a() {
        return null;
    }

    @Override // defpackage.bkrw
    public cjtd b() {
        return null;
    }

    @Override // defpackage.bkrw
    public int c() {
        return 0;
    }

    @Override // defpackage.bkrw
    public CharSequence d() {
        return String.format(Locale.US, "+%d", Integer.valueOf(this.e));
    }

    @Override // defpackage.bkrw
    public CharSequence e() {
        return "";
    }

    @Override // defpackage.bkrw
    public cqkl f() {
        View a;
        View findViewById = this.b.findViewById(R.id.filter_toolbar_view);
        List<bksb> s = ((bksq) this.d).a.s();
        if (findViewById != null && !s.isEmpty()) {
            for (View view : cqkx.n(s.get(0))) {
                if (view.getParent() == findViewById && (a = cqhu.a(view, bkrw.a)) != null) {
                    a.sendAccessibilityEvent(8);
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bkrw
    public Boolean g() {
        return false;
    }

    @Override // defpackage.bkrw
    public cjtd h() {
        return this.c;
    }

    @Override // defpackage.bkrw
    public CharSequence i() {
        return this.f;
    }
}
