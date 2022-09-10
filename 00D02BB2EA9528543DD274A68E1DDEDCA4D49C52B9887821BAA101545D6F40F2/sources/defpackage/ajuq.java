package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajuq  reason: default package */
/* loaded from: classes2.dex */
public final class ajuq implements cxqo {
    final cxqo a;
    final /* synthetic */ ajur b;

    public ajuq(ajur ajurVar, cxqo cxqoVar) {
        this.b = ajurVar;
        this.a = cxqoVar;
    }

    @Override // defpackage.cxqo
    public final Stopwatch a(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.cxqo
    public final void b(eaze eazeVar) {
        this.a.b(eazeVar);
    }

    @Override // defpackage.cxqo
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.cxqo
    public final void d(int i, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        int i2 = peopleKitVisualElementPath.a.a.get(0).a.a;
        ajur ajurVar = this.b;
        cjqy cjqyVar = ajurVar.b;
        cjqq cjqqVar = ajurVar.c;
        ddgj.a();
        ddgj ddgjVar = ddgj.a.get(new ddgi(i2));
        if (ddgjVar == null) {
            bvoo.h("Visual element id=%d not found in SocialSendkitVisualElementType enum. Can't log VE.", Integer.valueOf(i2));
        } else if (i == -1) {
            cjqqVar.g().d(cjtd.a(ddgjVar));
        } else if (i == 4) {
            cjqyVar.i(cjtd.a(ddgjVar));
        }
        this.a.d(i, peopleKitVisualElementPath);
    }

    @Override // defpackage.cxqo
    public final void e(int i) {
        this.a.e(i);
    }

    @Override // defpackage.cxqo
    public final void f(PeopleKitConfig peopleKitConfig, @dzsi int i) {
        this.a.f(peopleKitConfig, i);
    }

    @Override // defpackage.cxqo
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.cxqo
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.cxqo
    public final int i() {
        return this.a.i();
    }
}
