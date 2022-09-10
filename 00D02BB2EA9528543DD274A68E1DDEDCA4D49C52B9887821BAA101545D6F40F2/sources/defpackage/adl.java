package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adl  reason: default package */
/* loaded from: classes2.dex */
public final class adl implements TextView.OnEditorActionListener {
    final /* synthetic */ adv a;

    public adl(adv advVar) {
        this.a = advVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.p();
        return true;
    }
}
