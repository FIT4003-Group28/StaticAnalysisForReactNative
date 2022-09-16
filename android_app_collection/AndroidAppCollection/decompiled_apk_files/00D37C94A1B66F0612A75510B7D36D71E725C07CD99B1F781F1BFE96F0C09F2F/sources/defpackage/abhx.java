package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abhx  reason: default package */
/* loaded from: classes.dex */
public final class abhx extends ajsl {
    public final TextView a;
    private final akbm b;

    public abhx(Context context, akbn akbnVar) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.live_chat_default_button, (ViewGroup) null, false);
        this.a = textView;
        this.b = akbnVar.a(textView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        HashMap hashMap = new HashMap(ajrsVar.e());
        this.b.a((apoj) obj, ajrsVar.a, hashMap);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apoj) obj).t.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.a(null, null, null);
    }

    public abhx(akbn akbnVar, Button button) {
        this.a = button;
        this.b = akbnVar.a(button);
    }
}
