package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdh  reason: default package */
/* loaded from: classes2.dex */
public final class akdh implements DialogInterface.OnClickListener {
    final /* synthetic */ ff a;
    final /* synthetic */ akdv b;

    public akdh(akdv akdvVar, ff ffVar) {
        this.b = akdvVar;
        this.a = ffVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null && i == -1) {
            this.b.j();
        }
    }
}
