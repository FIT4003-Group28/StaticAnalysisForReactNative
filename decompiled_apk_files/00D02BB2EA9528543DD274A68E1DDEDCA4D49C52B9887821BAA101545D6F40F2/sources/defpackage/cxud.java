package defpackage;

import android.widget.EditText;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxud  reason: default package */
/* loaded from: classes5.dex */
public final class cxud implements cxsd {
    final /* synthetic */ PeopleKitDataLayer a;
    final /* synthetic */ cxse b;
    final /* synthetic */ cxui c;

    public cxud(cxui cxuiVar, PeopleKitDataLayer peopleKitDataLayer, cxse cxseVar) {
        this.c = cxuiVar;
        this.a = peopleKitDataLayer;
        this.b = cxseVar;
    }

    @Override // defpackage.cxsd
    public final void a() {
        this.c.c.b();
        EditText editText = this.c.j;
        if (editText != null) {
            this.a.l(editText.getText().toString());
        }
    }

    @Override // defpackage.cxsd
    public final void b() {
        if (!this.b.e()) {
            this.c.c.b();
        }
    }
}
