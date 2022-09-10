package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: bazl  reason: default package */
/* loaded from: classes3.dex */
public abstract class bazl implements bayn {
    public final Activity a;
    public final cjqy b;
    private final bvsx c;
    private final String d;
    private final String e;
    private final ddho f;

    public bazl(Activity activity, cjqy cjqyVar, String str, String str2, ddho ddhoVar) {
        this.a = activity;
        this.c = new bvsx(activity.getResources());
        this.b = cjqyVar;
        this.d = str;
        this.e = str2;
        this.f = ddhoVar;
    }

    private static boolean j(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // defpackage.bayn
    public cqkl b() {
        throw null;
    }

    @Override // defpackage.bayn
    public acpa c() {
        return null;
    }

    @Override // defpackage.bayn
    public final Boolean d() {
        return Boolean.valueOf(j(this.a));
    }

    @Override // defpackage.bayn
    public cjtd e() {
        return cjtd.a(this.f);
    }

    @Override // defpackage.bayn
    public CharSequence f() {
        bvsu b = this.c.b(this.d);
        bvsw bvswVar = new bvsw();
        bvswVar.e(ibm.n().b(this.a));
        b.b(bvswVar);
        bvsv a = this.c.a(this.e);
        a.k(new bazk(this));
        b.a(a);
        return b.c();
    }

    @Override // defpackage.bayn
    public final Boolean g() {
        return Boolean.valueOf(!j(this.a));
    }

    @Override // defpackage.bayn
    public String h() {
        return "";
    }

    @Override // defpackage.bayn
    public cqtd i() {
        return null;
    }
}
