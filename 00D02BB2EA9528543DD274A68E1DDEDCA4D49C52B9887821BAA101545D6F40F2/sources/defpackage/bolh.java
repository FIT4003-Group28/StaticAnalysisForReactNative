package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bolh  reason: default package */
/* loaded from: classes3.dex */
public class bolh implements bole {
    private final List<bokt> a;
    private final jbk b;

    public bolh(final Activity activity, List<dlfh> list, final auin auinVar, begg beggVar, final bsvm bsvmVar) {
        this.a = new ArrayList(list.size());
        for (dlfh dlfhVar : list) {
            this.a.add(new boku(activity, dlfhVar, beggVar));
        }
        jhz a = jhz.a();
        a.a = activity.getString(R.string.PUBLISHED_EDITS_OVERVIEW_TITLE);
        a.l = activity.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        a.f(new View.OnClickListener(activity) { // from class: bolf
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onBackPressed();
            }
        });
        jhm a2 = jhm.a();
        a2.h = 0;
        a2.a = activity.getString(R.string.EDIT_PUBLISHED_NOTIFICATION_SETTINGS);
        a2.d(new View.OnClickListener(bsvmVar, auinVar) { // from class: bolg
            private final bsvm a;
            private final auin b;

            {
                this.a = bsvmVar;
                this.b = auinVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(this.b);
            }
        });
        a.c(a2.c());
        this.b = new iyl(a.b());
    }

    @Override // defpackage.bole
    public List<bokt> a() {
        return this.a;
    }

    @Override // defpackage.bole
    public jbk b() {
        return this.b;
    }
}
