package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpdw  reason: default package */
/* loaded from: classes3.dex */
public final class bpdw extends gen {
    public static final cjtd a = cjtd.a(dtya.bO);
    public static final cjtd b = cjtd.a(dtya.bP);
    private cqkf<bpvj> ad;
    public cqkj c;
    public gfq d;
    @dzsi
    public CharSequence e;
    public int g;

    public final void g(int i) {
        this.ad.e(null);
        gfq.m(this);
        CharSequence charSequence = this.e;
        dbsk.s(charSequence);
        Nw(new bpdx(charSequence.toString(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Bundle bundle2 = this.o;
        CharSequence charSequence = bundle2.getCharSequence("key_road_name_or_address");
        dbsk.s(charSequence);
        this.e = charSequence;
        this.g = bundle2.getInt("button_text_res_id");
        cqkf<bpvj> c = this.c.c(new bpil(), null);
        this.ad = c;
        c.e(new bpdt(this));
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.requestWindowFeature(1);
        gdfVar.setContentView(this.ad.c());
        gdfVar.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bpds
            private final bpdw a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.g(3);
            }
        });
        return gdfVar;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bN;
    }
}
