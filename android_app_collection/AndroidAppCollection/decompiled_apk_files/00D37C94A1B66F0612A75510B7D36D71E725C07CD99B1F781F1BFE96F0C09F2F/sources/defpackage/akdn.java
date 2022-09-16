package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: akdn  reason: default package */
/* loaded from: classes.dex */
final class akdn implements View.OnClickListener {
    final /* synthetic */ akdo a;
    private final /* synthetic */ int b;

    public akdn(akdo akdoVar) {
        this.a = akdoVar;
    }

    public akdn(akdo akdoVar, int i) {
        this.b = i;
        this.a = akdoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.mJ().onBackPressed();
            return;
        }
        akdo akdoVar = this.a;
        if (akdoVar.c) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", akdoVar.mJ().getPackageName(), null));
            akdoVar.mJ().startActivity(intent);
            return;
        }
        akdoVar.ab(akdoVar.b, 1);
    }
}
