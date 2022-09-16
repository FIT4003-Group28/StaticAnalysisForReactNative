package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackstagePollEditorView extends LinearLayout {
    public auez a;
    public TextView b;
    public xut c;
    private int d;
    private int e;

    public BackstagePollEditorView(Context context) {
        super(context);
        e(context);
    }

    private final void e(Context context) {
        setOrientation(1);
        setGravity(8388611);
        this.d = zhn.j(context, R.attr.ytTextSecondary).orElse(0);
        this.e = zhn.d(context, R.attr.ytStaticBrandRed);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount() - 1; i++) {
            arrayList.add(((EditText) getChildAt(i).findViewById(R.id.option_text)).getText().toString().trim());
        }
        return arrayList;
    }

    public final void b(String str) {
        arag aragVar;
        aqxo.z(getChildCount() > 0 && this.b != null, "The create option button must be added to the view before adding options");
        if (getChildCount() - 1 >= this.a.f) {
            return;
        }
        final View inflate = LayoutInflater.from(getContext()).inflate(R.layout.backstage_poll_editor_option, (ViewGroup) this, false);
        View findViewById = inflate.findViewById(R.id.remove_button);
        TextView textView = (TextView) inflate.findViewById(R.id.character_counter);
        final EditText editText = (EditText) inflate.findViewById(R.id.option_text);
        editText.setText(str);
        d(str.length(), textView);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackstagePollEditorView backstagePollEditorView = BackstagePollEditorView.this;
                View view2 = inflate;
                if (backstagePollEditorView.getChildCount() - 1 <= backstagePollEditorView.a.e) {
                    backstagePollEditorView.c();
                    xut xutVar = backstagePollEditorView.c;
                    if (xutVar == null) {
                        return;
                    }
                    xutVar.a.aF.setVisibility(8);
                    xutVar.a.aJ();
                    xutVar.a.aL();
                    return;
                }
                backstagePollEditorView.removeView(view2);
                zag.o(backstagePollEditorView.b, true);
                xut xutVar2 = backstagePollEditorView.c;
                if (xutVar2 == null) {
                    return;
                }
                xutVar2.a();
            }
        });
        auez auezVar = this.a;
        if ((auezVar.b & 2) != 0) {
            aragVar = auezVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if (!TextUtils.isEmpty(b)) {
            editText.setHint(b);
        }
        if (this.a.h > 0) {
            editText.addTextChangedListener(new xuc(this, textView));
        }
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!TextUtils.isEmpty((String) it.next())) {
                editText.requestFocus();
                if (zdg.e(getContext())) {
                    new Handler().postDelayed(new Runnable() { // from class: xub
                        @Override // java.lang.Runnable
                        public final void run() {
                            editText.sendAccessibilityEvent(8);
                        }
                    }, 500L);
                }
            }
        }
        addView(inflate, getChildCount() - 1);
        if (getChildCount() - 1 < this.a.f) {
            return;
        }
        zag.o(this.b, false);
    }

    public final void c() {
        removeAllViews();
        this.b = null;
    }

    public final void d(int i, TextView textView) {
        String str;
        if (i > 0) {
            int i2 = this.a.h;
            StringBuilder sb = new StringBuilder(25);
            sb.append(i);
            sb.append(" / ");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = "";
        }
        textView.setText(str);
        textView.setTextColor(i > this.a.h ? this.e : this.d);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }
}
