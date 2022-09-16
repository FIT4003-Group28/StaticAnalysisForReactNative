package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nhq  reason: default package */
/* loaded from: classes3.dex */
final class nhq implements fry {
    final /* synthetic */ nhr a;
    private final String b;
    private final byte[] c;

    public nhq(nhr nhrVar, String str, byte[] bArr) {
        this.a = nhrVar;
        str.getClass();
        this.b = str;
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_flag_playlist;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.flag_playlist_menu;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        final gea geaVar = this.a.e;
        final String str = this.b;
        final byte[] bArr = this.c;
        new AlertDialog.Builder(geaVar.a).setMessage(geaVar.a.getString(R.string.report_playlist_confirmation)).setPositiveButton(R.string.report_button, new DialogInterface.OnClickListener() { // from class: gdv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                gea geaVar2 = gea.this;
                String str2 = str;
                byte[] bArr2 = bArr;
                aawk a = geaVar2.f.a();
                a.a = str2;
                a.k(bArr2);
                geaVar2.f.b(a, new gdz(geaVar2));
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
        return true;
    }
}
