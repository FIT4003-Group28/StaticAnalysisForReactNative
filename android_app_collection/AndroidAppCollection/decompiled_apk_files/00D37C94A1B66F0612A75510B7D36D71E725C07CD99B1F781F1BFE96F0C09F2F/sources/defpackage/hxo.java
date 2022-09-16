package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteReelItem$DeleteReelItemEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxo  reason: default package */
/* loaded from: classes3.dex */
public final class hxo implements aafl {
    public final Context a;
    public final abbr b;
    public final afvn c;
    public final ifm d;
    public final iee e;
    public int f = 0;
    private AlertDialog g;

    public hxo(Context context, abbr abbrVar, afvn afvnVar, ifm ifmVar, iee ieeVar) {
        this.a = context;
        abbrVar.getClass();
        this.b = abbrVar;
        afvnVar.getClass();
        this.c = afvnVar;
        ifmVar.getClass();
        this.d = ifmVar;
        ieeVar.getClass();
        this.e = ieeVar;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        this.f = this.e.a();
        if (this.g == null) {
            AlertDialog create = new AlertDialog.Builder(this.a).setMessage(R.string.delete_reel_item_confirmation).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
            this.g = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hxm
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    hxo hxoVar = hxo.this;
                    hxoVar.e.c(hxoVar.f);
                    hxoVar.f = 0;
                }
            });
        }
        this.g.setButton(-1, this.a.getString(17039370), new DialogInterface.OnClickListener() { // from class: hxl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                hxo hxoVar = hxo.this;
                apzg apzgVar2 = apzgVar;
                aopa createBuilder = arqn.a.createBuilder();
                DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = (DeleteReelItem$DeleteReelItemEndpoint) apzgVar2.qm(DeleteReelItem$DeleteReelItemEndpoint.deleteReelItemEndpoint);
                String str = deleteReelItem$DeleteReelItemEndpoint.c;
                createBuilder.copyOnWrite();
                arqn arqnVar = (arqn) createBuilder.instance;
                str.getClass();
                arqnVar.b |= 4;
                arqnVar.e = str;
                String str2 = deleteReelItem$DeleteReelItemEndpoint.b;
                createBuilder.copyOnWrite();
                arqn arqnVar2 = (arqn) createBuilder.instance;
                str2.getClass();
                arqnVar2.b |= 2;
                arqnVar2.d = str2;
                try {
                    abbr abbrVar = hxoVar.b;
                    abbp abbpVar = new abbp(abbrVar.e, hxoVar.c.c(), createBuilder);
                    abbpVar.i = aadf.b(abbrVar.g);
                    abbpVar.i();
                    hxoVar.b.b.e(abbpVar, new hxn(hxoVar, (arqn) createBuilder.mo39build()));
                } catch (aart unused) {
                }
            }
        });
        this.g.show();
    }
}
