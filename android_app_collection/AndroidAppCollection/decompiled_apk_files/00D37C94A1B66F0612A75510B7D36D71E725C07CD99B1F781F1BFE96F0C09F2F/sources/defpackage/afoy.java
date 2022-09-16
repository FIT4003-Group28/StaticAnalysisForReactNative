package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: afoy  reason: default package */
/* loaded from: classes.dex */
public final class afoy extends ue {
    public final ArrayList a;
    public cyv b;
    public boolean c;
    public aajl d;
    public String e;
    public boolean f;
    public Context g;
    public ajvi h;
    public awmt i;
    public tcu j;
    private aypg k;

    public afoy(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.a.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TextWatcher textWatcher = (TextWatcher) arrayList.get(i);
            if (textWatcher instanceof afpc) {
                ((afpc) textWatcher).b();
            }
            super.removeTextChangedListener(textWatcher);
        }
        this.a.clear();
    }

    public final void c(aajl aajlVar, ayor ayorVar, awmt awmtVar, tcu tcuVar) {
        this.d = aajlVar;
        this.i = awmtVar;
        this.j = tcuVar;
        this.e = aakj.f(avcb.b.a(), "");
        aypg aypgVar = this.k;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.k);
        }
        this.k = null;
        this.k = aajlVar.h(this.e, false).X(ayorVar).as(new ayqb() { // from class: afow
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aajj aajjVar;
                afoy afoyVar = afoy.this;
                aajp aajpVar = (aajp) obj;
                if (aajpVar == null || (aajjVar = aajpVar.c) == null) {
                    return;
                }
                avca avcaVar = (avca) aajjVar;
                avcc avccVar = avcc.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
                int ordinal = avcaVar.getAction().ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        afoyVar.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                } else if (afoyVar.f && avcaVar.b.d == 3) {
                    aqup emoji = avcaVar.getEmoji();
                    if (emoji.e.size() > 0) {
                        String str = (String) emoji.e.get(0);
                        if (afoyVar.getSelectionStart() < 0 || afoyVar.getSelectionEnd() < 0) {
                            afoyVar.getEditableText().insert(afoyVar.mo589getText().length(), str);
                        } else {
                            afoyVar.getEditableText().replace(afoyVar.getSelectionStart(), afoyVar.getSelectionEnd(), str);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        ajvi ajviVar = afoyVar.h;
                        avhn avhnVar = emoji.f;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                        ajviVar.a(str, avhnVar, afoyVar.g.getResources().getDimension(R.dimen.emoji_height), emoji.d, afoyVar.getId(), spannableStringBuilder, null);
                    }
                } else if (avcaVar.b.d == 2) {
                    String text = avcaVar.getText();
                    boolean booleanValue = avcaVar.getShouldConditionallyPrependWhitespace().booleanValue();
                    if (avcaVar.getShouldAppendWhitespace().booleanValue()) {
                        text = String.valueOf(text).concat(" ");
                    }
                    int selectionStart = afoyVar.getSelectionStart() >= 0 ? afoyVar.getSelectionStart() : afoyVar.mo589getText().length() + 1;
                    int selectionEnd = afoyVar.getSelectionEnd() >= 0 ? afoyVar.getSelectionEnd() : 1 + afoyVar.mo589getText().length();
                    if (booleanValue && selectionStart > 0) {
                        if (" \n\r-_".indexOf(afoyVar.mo589getText().charAt(selectionStart - 1)) == -1) {
                            String valueOf = String.valueOf(text);
                            text = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                        }
                    }
                    afoyVar.getEditableText().replace(selectionStart, selectionEnd, text);
                }
                aajs c = afoyVar.d.c();
                c.g(afoyVar.e);
                c.b().Q();
                awmt awmtVar2 = afoyVar.i;
                if (awmtVar2 == null) {
                    return;
                }
                afoyVar.j.b(awmtVar2, afpe.b(afoyVar)).Q();
            }
        });
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.c || i != 66) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.a.remove(textWatcher);
        super.removeTextChangedListener(textWatcher);
    }
}
