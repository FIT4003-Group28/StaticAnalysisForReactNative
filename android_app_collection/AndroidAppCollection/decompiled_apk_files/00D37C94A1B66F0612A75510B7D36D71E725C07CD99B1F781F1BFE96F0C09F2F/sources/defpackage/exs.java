package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: exs  reason: default package */
/* loaded from: classes3.dex */
final class exs implements DialogInterface.OnKeyListener {
    final /* synthetic */ ext a;

    public exs(ext extVar) {
        this.a = extVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1 && this.a.ag != null;
    }
}
