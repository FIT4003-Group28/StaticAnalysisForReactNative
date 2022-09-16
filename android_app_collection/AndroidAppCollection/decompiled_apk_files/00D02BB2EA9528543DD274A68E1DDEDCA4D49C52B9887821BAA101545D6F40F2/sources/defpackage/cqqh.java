package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqqh  reason: default package */
/* loaded from: classes.dex */
public class cqqh extends cqie {
    private final boolean a;
    private final boolean d;

    public cqqh(Context context, cqhw cqhwVar, dehp dehpVar, boolean z) {
        this(context, cqhwVar, dehpVar, z, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqie
    public void a(List<cqkv> list) {
        list.add(new cqqk(this));
        super.a(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqie
    public void b(cqpr<View> cqprVar) {
        if (this.a) {
            cqprVar.a(AutoCompleteTextView.class, xb.class);
            cqprVar.a(Button.class, xd.class);
            cqprVar.a(CheckBox.class, xe.class);
            cqprVar.a(CheckedTextView.class, xf.class);
            cqprVar.a(EditText.class, xj.class);
            cqprVar.a(ImageButton.class, xl.class);
            cqprVar.a(ImageView.class, AppCompatImageView.class);
            cqprVar.a(MultiAutoCompleteTextView.class, xn.class);
            cqprVar.a(RadioButton.class, xq.class);
            cqprVar.a(RatingBar.class, xr.class);
            cqprVar.a(SeekBar.class, xs.class);
            cqprVar.a(Spinner.class, ye.class);
            cqprVar.a(TextView.class, cqro.class);
        }
    }

    @Override // defpackage.cqie, defpackage.cqho
    protected final cqid e() {
        return new cqid(this.d);
    }

    public cqqh(Context context, cqhw cqhwVar, dehp dehpVar, boolean z, boolean z2) {
        super(context, cqhwVar);
        this.a = z;
        this.d = z2;
    }
}
