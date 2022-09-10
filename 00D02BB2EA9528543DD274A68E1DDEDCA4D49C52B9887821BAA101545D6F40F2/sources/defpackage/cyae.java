package defpackage;

import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* renamed from: cyae  reason: default package */
/* loaded from: classes5.dex */
public final class cyae implements degu<dcdc<ContactMethodField>> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ AndroidLibAutocompleteSession c;

    public cyae(AndroidLibAutocompleteSession androidLibAutocompleteSession, String str, boolean z) {
        this.c = androidLibAutocompleteSession;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (String.valueOf(th.getMessage()).length() != 0) {
            return;
        }
        new String("Failed to get owner fields: ");
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dcdc<ContactMethodField> dcdcVar) {
        dcdc<ContactMethodField> dcdcVar2 = dcdcVar;
        if (this.c.h()) {
            this.c.m.h(dcdcVar2);
            super/*cxye*/.f(this.a, this.b);
            return;
        }
        dbsk.t(this.a, "The parameter query cannot be null.");
        int i = dbsj.d(this.a) ? 6 : 7;
        this.c.m.h(dcdcVar2);
        this.c.p(this.a, i, this.b);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = this.c;
        androidLibAutocompleteSession.c.a(androidLibAutocompleteSession.l);
    }
}
