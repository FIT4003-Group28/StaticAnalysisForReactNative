package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitq  reason: default package */
/* loaded from: classes2.dex */
public class aitq implements aipc {
    public dbsg<String> a;
    public dbsg<String> b;
    private final Resources c;
    private final aito d;

    public aitq(Resources resources, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, aito aitoVar) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.d = aitoVar;
        this.c = resources;
    }

    @Override // defpackage.aipc
    public cqkl a() {
        if (this.a.a()) {
            ((airr) this.d).i(this.a.b());
        }
        return cqkl.a;
    }

    @Override // defpackage.aipc
    public CharSequence b() {
        return this.c.getString(R.string.SHARING_VIA_LINK_TITLE);
    }

    @Override // defpackage.aipc
    public CharSequence c() {
        return this.b.c("");
    }
}
