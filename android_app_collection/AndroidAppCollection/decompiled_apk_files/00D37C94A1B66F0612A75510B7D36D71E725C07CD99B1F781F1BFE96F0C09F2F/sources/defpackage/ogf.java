package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ogf  reason: default package */
/* loaded from: classes3.dex */
public final class ogf extends ogg {
    public SharedPreferences ae;
    public aafo af;
    public wal ag;

    private final boolean aG() {
        wal walVar = this.ag;
        return (walVar == null || walVar.a() == null || !this.ag.a().b.endsWith("@google.com")) ? false : true;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        n(false);
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Drawable a;
        dt mJ = mJ();
        final int a2 = zfm.a(mJ);
        View inflate = LayoutInflater.from(mJ).inflate(R.layout.dogfood_warning_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.meme_image);
        if (aG()) {
            a = akf.a(rb(), R.drawable.dogfood_hiring_warning);
        } else {
            a = akf.a(rb(), R.drawable.dogfood_warning);
        }
        imageView.setImageDrawable(a);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "This is INTERNAL ONLY!\nPlease do not share outside of Google.\n");
        if (aG()) {
            spannableStringBuilder.append((CharSequence) "YouTube is hiring:\n");
            spannableStringBuilder.append((CharSequence) "go/ytma-jobs");
            spannableStringBuilder.setSpan(new StyleSpan(1), 62, 93, 33);
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopg aopgVar = UrlEndpointOuterClass.urlEndpoint;
            aopa createBuilder = avvk.a.createBuilder();
            createBuilder.copyOnWrite();
            avvk avvkVar = (avvk) createBuilder.instance;
            avvkVar.b = 1 | avvkVar.b;
            avvkVar.c = "http://go/ytma-jobs";
            aopcVar.e(aopgVar, (avvk) createBuilder.mo39build());
            spannableStringBuilder.setSpan(aaft.a(false).a(this.af, null, (apzg) aopcVar.mo39build()), 81, 93, 33);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dogfood_warning_dialog_dismiss_button);
        textView2.setText(R.string.ok);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: oge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ogf ogfVar = ogf.this;
                ogfVar.ae.edit().putInt("dogfood_warning_shown_version", a2).apply();
                ogfVar.dismiss();
            }
        });
        final AlertDialog create = new AlertDialog.Builder(mJ()).setView(inflate).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ogd
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ogf ogfVar = ogf.this;
                Dialog dialog = create;
                if (ogfVar.mJ() == null) {
                    return;
                }
                dialog.getWindow().setLayout((int) ogfVar.mJ().getResources().getDimension(R.dimen.dogfood_warning_dialog_width), -2);
            }
        });
        return create;
    }
}
