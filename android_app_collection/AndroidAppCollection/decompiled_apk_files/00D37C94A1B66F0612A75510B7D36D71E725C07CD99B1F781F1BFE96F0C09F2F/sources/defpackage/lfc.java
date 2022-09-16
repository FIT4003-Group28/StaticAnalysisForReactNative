package defpackage;

import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
/* compiled from: PG */
/* renamed from: lfc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lfc implements zdt {
    public final /* synthetic */ GeneralPrefsFragment a;
    public final /* synthetic */ ProtoDataStoreListPreference b;
    public final /* synthetic */ aurq c;
    private final /* synthetic */ int d;

    public /* synthetic */ lfc(GeneralPrefsFragment generalPrefsFragment, ProtoDataStoreListPreference protoDataStoreListPreference, aurq aurqVar) {
        this.a = generalPrefsFragment;
        this.b = protoDataStoreListPreference;
        this.c = aurqVar;
    }

    public /* synthetic */ lfc(GeneralPrefsFragment generalPrefsFragment, ProtoDataStoreListPreference protoDataStoreListPreference, aurq aurqVar, int i) {
        this.d = i;
        this.a = generalPrefsFragment;
        this.b = protoDataStoreListPreference;
        this.c = aurqVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.d == 0) {
            GeneralPrefsFragment generalPrefsFragment = this.a;
            ProtoDataStoreListPreference protoDataStoreListPreference = this.b;
            aurq aurqVar = this.c;
            Throwable th = (Throwable) obj;
            zep.b("Error getting stored language");
            generalPrefsFragment.am.f(protoDataStoreListPreference, aurqVar, "");
            protoDataStoreListPreference.G(true);
            return;
        }
        GeneralPrefsFragment generalPrefsFragment2 = this.a;
        ProtoDataStoreListPreference protoDataStoreListPreference2 = this.b;
        generalPrefsFragment2.am.f(protoDataStoreListPreference2, this.c, (String) obj);
        protoDataStoreListPreference2.G(true);
    }
}
