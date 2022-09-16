package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajlu  reason: default package */
/* loaded from: classes.dex */
public final class ajlu implements tct {
    private final Context a;

    public ajlu(Context context) {
        this.a = context;
    }

    private final void e(int i) {
        Toast.makeText(this.a, this.a.getString(i), 1).show();
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awqh.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final awqh awqhVar = (awqh) obj;
        return aynr.t(new aypv() { // from class: ajlt
            @Override // defpackage.aypv
            public final void a() {
                ajlu.this.d(awqhVar);
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    public final /* synthetic */ void d(awqh awqhVar) {
        String str = awqhVar.c;
        if (TextUtils.isEmpty(str)) {
            e(R.string.error_link_cannot_be_opened);
            return;
        }
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", zgt.j(str)).setFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            e(R.string.error_browser_not_found);
        }
    }
}
