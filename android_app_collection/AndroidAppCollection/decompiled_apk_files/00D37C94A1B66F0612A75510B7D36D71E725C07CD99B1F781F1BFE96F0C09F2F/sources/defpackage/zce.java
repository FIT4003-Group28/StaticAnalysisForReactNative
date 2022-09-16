package defpackage;

import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
/* compiled from: PG */
/* renamed from: zce  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zce implements zdt {
    public final /* synthetic */ ProtoDataStoreListPreference a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ zce(ProtoDataStoreListPreference protoDataStoreListPreference, String str) {
        this.a = protoDataStoreListPreference;
        this.b = str;
    }

    public /* synthetic */ zce(ProtoDataStoreListPreference protoDataStoreListPreference, String str, int i) {
        this.c = i;
        this.a = protoDataStoreListPreference;
        this.b = str;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Throwable th = (Throwable) obj;
            this.a.ae(this.b);
        } else if (i == 1) {
            this.a.ac(this.b, (String) obj);
        } else {
            Void r3 = (Void) obj;
            this.a.ai(this.b);
        }
    }
}
