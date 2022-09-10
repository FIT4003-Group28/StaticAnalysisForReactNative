package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import com.google.android.apps.gmm.base.components.edittext.IncognitoAwareEditText;
import com.google.android.apps.gmm.shared.webview.DarkModeAwareWebView;
import java.util.List;
/* compiled from: PG */
/* renamed from: iui  reason: default package */
/* loaded from: classes.dex */
public class iui extends cqqh {
    private final cjqy a;
    private final bvjj d;
    private final ff e;
    private final ite f;

    @Deprecated
    public iui(Context context, ff ffVar, cqhw cqhwVar, dehp dehpVar, cjqy cjqyVar, bvjj bvjjVar, ite iteVar) {
        super(context, cqhwVar, dehpVar, true, true);
        this.e = ffVar;
        this.a = cjqyVar;
        this.d = bvjjVar;
        this.f = iteVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public void a(List<cqkv> list) {
        dbsg.i(this.e);
        cjqy cjqyVar = this.a;
        bvjj bvjjVar = this.d;
        ite iteVar = this.f;
        list.add(new iuj());
        list.add(new iub(cjqyVar, iteVar));
        list.add(new cqpn());
        list.add(new ackf(cjqyVar, bvjjVar, iteVar));
        list.add(hzh.d);
        list.add(new ebh());
        list.add(new cqpp());
        list.add(cqoh.a);
        super.a(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public final void b(cqpr<View> cqprVar) {
        super.b(cqprVar);
        cqprVar.a(EditText.class, IncognitoAwareEditText.class);
        cqprVar.a(WebView.class, DarkModeAwareWebView.class);
    }
}
