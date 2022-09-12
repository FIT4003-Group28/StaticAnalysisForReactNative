package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wfv  reason: default package */
/* loaded from: classes7.dex */
public class wfv implements bxsz {
    private final cqtd a;
    private final cqss b = ibm.b();
    private final cqss c = ibm.Y();
    private final cjtd d;
    private final String e;
    private final dbty<Integer> f;
    private final Runnable g;

    public wfv(Context context, ddho ddhoVar, dbty<Integer> dbtyVar, Runnable runnable, wfu wfuVar) {
        this.d = cjtd.a(ddhoVar);
        if (wfuVar.equals(wfu.ADD)) {
            this.a = cqrt.g(2131232137, ibm.c());
            this.e = context.getString(R.string.SAVED_TRIPS_ALIAS_BOOKMARKS_ADD_TEXT);
        } else {
            this.a = cqrt.g(2131232792, ibm.c());
            this.e = context.getString(R.string.SAVED_TRIPS_ALIAS_BOOKMARKS_MORE_TEXT);
        }
        this.f = dbtyVar;
        this.g = runnable;
    }

    @Override // defpackage.bxsz
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.bxsz
    public cqss b() {
        return this.b;
    }

    @Override // defpackage.bxsz
    public cqss c() {
        return this.c;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.e;
    }

    @Override // defpackage.bxsz
    public String e() {
        return this.e;
    }

    @Override // defpackage.bxsz
    @dzsi
    public String f() {
        return null;
    }

    @Override // defpackage.bxsz
    public Integer g() {
        return this.f.a();
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.g.run();
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.d;
    }

    @Override // defpackage.abql
    public View.OnAttachStateChangeListener j() {
        return null;
    }

    @Override // defpackage.abql
    public cqtd k() {
        return abqk.a();
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
