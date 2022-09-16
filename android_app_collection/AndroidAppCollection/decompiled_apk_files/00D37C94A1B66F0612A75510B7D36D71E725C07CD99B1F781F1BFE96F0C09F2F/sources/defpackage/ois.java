package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
/* compiled from: PG */
/* renamed from: ois  reason: default package */
/* loaded from: classes3.dex */
public final class ois implements ezg, gbn {
    public final WatchWhileActivity a;
    public int b;
    public boolean c;
    private final ind d;
    private PaneDescriptor e;
    private ezx f;

    public ois(WatchWhileActivity watchWhileActivity, ind indVar) {
        this.a = watchWhileActivity;
        this.d = indVar;
    }

    public final void a() {
        PaneDescriptor paneDescriptor = this.e;
        if (paneDescriptor == null) {
            return;
        }
        boolean z = !this.d.f(paneDescriptor);
        ezx ezxVar = this.f;
        if ((ezxVar != null && ezxVar.h()) || z) {
            if (this.c) {
                return;
            }
            this.a.getWindow().setSoftInputMode(this.b);
            return;
        }
        this.a.getWindow().setSoftInputMode(48);
        this.c = false;
    }

    @Override // defpackage.gbn
    public final void e(gbd gbdVar) {
        this.e = PaneDescriptor.b(gbdVar);
        a();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        this.f = ezxVar;
        a();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
