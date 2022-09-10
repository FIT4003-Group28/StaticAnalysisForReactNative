package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.gmm.base.components.edittext.IncognitoAwareEditText;
import java.util.List;
/* compiled from: PG */
/* renamed from: qeq  reason: default package */
/* loaded from: classes7.dex */
final class qeq extends cqqh {
    final /* synthetic */ qes a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeq(qes qesVar, Context context, cqhw cqhwVar, dehp dehpVar) {
        super(context, cqhwVar, dehpVar, true);
        this.a = qesVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public final void a(List<cqkv> list) {
        list.add(new iuj());
        dbsg.i(this.a.J());
        qes qesVar = this.a;
        list.add(new iub(qesVar.e, qesVar.ai));
        qes qesVar2 = this.a;
        list.add(new ackf(qesVar2.e, qesVar2.f, qesVar2.ai));
        super.a(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public final void b(cqpr<View> cqprVar) {
        super.b(cqprVar);
        cqprVar.a(EditText.class, IncognitoAwareEditText.class);
    }
}
