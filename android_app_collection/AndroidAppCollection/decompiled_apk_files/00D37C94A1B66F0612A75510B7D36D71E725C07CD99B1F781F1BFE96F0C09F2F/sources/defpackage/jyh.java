package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jyh  reason: default package */
/* loaded from: classes3.dex */
public final class jyh {
    public final Activity a;
    public final aafo b;
    public AlertDialog c;
    public View d;
    public final azqb e;
    private RadioGroup f;

    public jyh(Activity activity, aafo aafoVar, azqb azqbVar) {
        this.a = activity;
        this.b = aafoVar;
        this.e = azqbVar;
    }

    public final void a(atul atulVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        if (this.c == null) {
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.options_dialog, (ViewGroup) null, false);
            this.d = inflate;
            ((TextView) inflate.findViewById(R.id.content_owner_rights)).setMovementMethod(LinkMovementMethod.getInstance());
            this.f = (RadioGroup) this.d.findViewById(R.id.option_items_list);
            for (atug atugVar : atulVar.c) {
                RadioButton radioButton = new RadioButton(this.a);
                int i = atugVar.b;
                if ((i & 8) != 0) {
                    atul atulVar2 = atugVar.f;
                    if (atulVar2 == null) {
                        atulVar2 = atul.a;
                    }
                    radioButton.setTag(atulVar2);
                    atul atulVar3 = atugVar.f;
                    if (atulVar3 == null) {
                        atulVar3 = atul.a;
                    }
                    if ((1 & atulVar3.b) != 0) {
                        atul atulVar4 = atugVar.f;
                        if (atulVar4 == null) {
                            atulVar4 = atul.a;
                        }
                        aragVar2 = atulVar4.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    radioButton.setText(ajgl.b(aragVar2));
                } else if ((i & 2) != 0) {
                    atuj atujVar = atugVar.d;
                    if (atujVar == null) {
                        atujVar = atuj.a;
                    }
                    radioButton.setTag(atujVar);
                    atuj atujVar2 = atugVar.d;
                    if (atujVar2 == null) {
                        atujVar2 = atuj.a;
                    }
                    if ((1 & atujVar2.b) != 0) {
                        atuj atujVar3 = atugVar.d;
                        if (atujVar3 == null) {
                            atujVar3 = atuj.a;
                        }
                        aragVar3 = atujVar3.c;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                    } else {
                        aragVar3 = null;
                    }
                    radioButton.setText(ajgl.b(aragVar3));
                } else if ((i & 1) != 0) {
                    atuh atuhVar = atugVar.c;
                    if (atuhVar == null) {
                        atuhVar = atuh.a;
                    }
                    radioButton.setTag(atuhVar);
                    atuh atuhVar2 = atugVar.c;
                    if (atuhVar2 == null) {
                        atuhVar2 = atuh.a;
                    }
                    if ((1 & atuhVar2.b) != 0) {
                        atuh atuhVar3 = atugVar.c;
                        if (atuhVar3 == null) {
                            atuhVar3 = atuh.a;
                        }
                        aragVar4 = atuhVar3.c;
                        if (aragVar4 == null) {
                            aragVar4 = arag.a;
                        }
                    } else {
                        aragVar4 = null;
                    }
                    radioButton.setText(ajgl.b(aragVar4));
                }
                radioButton.setTextColor(this.a.getResources().getColor(R.color.yt_black_pure));
                aken akenVar = (aken) this.e.get();
                akenVar.c(radioButton, R.dimen.report_video_option_text_padding, R.dimen.report_video_option_padding);
                akenVar.b(radioButton);
                if (akenVar.a) {
                    radioButton.setTextColor(zhn.d(radioButton.getContext(), R.attr.ytTextPrimary));
                }
                this.f.addView(radioButton);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
            if ((atulVar.b & 1) != 0) {
                aragVar = atulVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            AlertDialog create = builder.setTitle(ajgl.b(aragVar)).setView(this.d).setPositiveButton(R.string.report_button, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            this.f.setOnCheckedChangeListener(new ltf(create, 1));
            this.c = create;
        }
        this.c.show();
        this.f.clearCheck();
        this.c.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: jyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jyh jyhVar = jyh.this;
                RadioGroup radioGroup = (RadioGroup) jyhVar.d.findViewById(R.id.option_items_list);
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId != -1) {
                    Object tag = radioGroup.findViewById(checkedRadioButtonId).getTag();
                    if (tag instanceof atul) {
                        new jyh(jyhVar.a, jyhVar.b, jyhVar.e).a((atul) tag);
                    } else if (tag instanceof atuj) {
                        aafo aafoVar = jyhVar.b;
                        apzg apzgVar = ((atuj) tag).d;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, null);
                    } else if (tag instanceof atuh) {
                        aafo aafoVar2 = jyhVar.b;
                        apzg apzgVar2 = ((atuh) tag).d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar2.c(apzgVar2, null);
                    }
                    jyhVar.c.dismiss();
                }
            }
        });
    }
}
