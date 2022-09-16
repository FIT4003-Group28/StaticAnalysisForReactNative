package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: albl  reason: default package */
/* loaded from: classes.dex */
final class albl extends zer {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albl(Context context) {
        super("WifiPreferenceLazyResourceLoader");
        this.a = context;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        return this.a.getString(R.string.upload_network_policy_pref_value_wifi);
    }
}
