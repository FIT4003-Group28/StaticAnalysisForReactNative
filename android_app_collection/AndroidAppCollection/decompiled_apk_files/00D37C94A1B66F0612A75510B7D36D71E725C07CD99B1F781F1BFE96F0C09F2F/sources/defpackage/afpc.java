package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.metadataeditor.elements.suggest.MdeSuggestBottomSheetController$CandidateChipSpan;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afpc  reason: default package */
/* loaded from: classes.dex */
public final class afpc implements TextWatcher, afpr {
    public final afoy a;
    public boolean b;
    public ArrayList c;
    public afps d;
    Map e;
    public List f;
    public List g;
    final boolean h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private ajwp[] j;
    private boolean k;
    private final Context l;
    private final tfj m;
    private final teb n;
    private final tda o;
    private final acti p;
    private final awmt q;
    private final tcu r;
    private ArrayList s;
    private CoordinatorLayout t;
    private final boolean u;
    private final afpt v;

    public afpc(Context context, afoy afoyVar, tfj tfjVar, teb tebVar, tda tdaVar, acti actiVar, awmt awmtVar, tcu tcuVar, boolean z, boolean z2, afpt afptVar, afpx afpxVar, akss akssVar, List list, List list2, boolean z3) {
        afpx afpxVar2 = afpxVar;
        this.l = context;
        this.a = afoyVar;
        this.m = tfjVar;
        this.n = tebVar;
        this.o = tdaVar;
        this.p = actiVar;
        this.q = awmtVar;
        this.r = tcuVar;
        this.b = z;
        this.v = afptVar;
        this.f = list;
        this.g = list2;
        HashMap hashMap = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            awsx awsxVar = (awsx) it.next();
            if (!awsxVar.c.equals("@")) {
                aksl akslVar = new aksl();
                aksr a = akssVar.a(Collections.singletonList(akslVar));
                a.c = awsxVar.d;
                ajsg ajsgVar = (ajsg) afpxVar2.a.get();
                ajsgVar.getClass();
                ajyi ajyiVar = (ajyi) afpxVar2.b.get();
                ajyiVar.getClass();
                ajyx ajyxVar = (ajyx) afpxVar2.c.get();
                ajyxVar.getClass();
                yni yniVar = (yni) afpxVar2.d.get();
                yniVar.getClass();
                akar akarVar = (akar) afpxVar2.e.get();
                akarVar.getClass();
                acth acthVar = (acth) afpxVar2.f.get();
                acthVar.getClass();
                yzj yzjVar = (yzj) afpxVar2.g.get();
                yzjVar.getClass();
                aadd aaddVar = (aadd) afpxVar2.h.get();
                aaddVar.getClass();
                aynx aynxVar = (aynx) afpxVar2.i.get();
                aynxVar.getClass();
                aksk akskVar = (aksk) afpxVar2.j.get();
                akskVar.getClass();
                acsf acsfVar = (acsf) afpxVar2.k.get();
                acsfVar.getClass();
                zfq zfqVar = (zfq) afpxVar2.l.get();
                zfqVar.getClass();
                context.getClass();
                Iterator it2 = it;
                HashMap hashMap2 = hashMap;
                afpw afpwVar = new afpw(ajsgVar, ajyiVar, ajyxVar, yniVar, akarVar, acthVar, yzjVar, aaddVar, aynxVar, akskVar, acsfVar, zfqVar, context, akslVar, a);
                if (awsxVar.e) {
                    try {
                        ((aksr) afpwVar.a.a).a("").get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
                hashMap2.put(awsxVar.c, new afpd(afpwVar));
                afpxVar2 = afpxVar;
                hashMap = hashMap2;
                it = it2;
            } else {
                afpxVar2 = afpxVar;
            }
        }
        this.e = hashMap;
        this.u = z2;
        this.h = z3;
    }

    private final void c(awsx awsxVar) {
        if (!this.h) {
            return;
        }
        Activity B = zew.B(this.a.b.b);
        ViewGroup viewGroup = (ViewGroup) B.getWindow().findViewById(R.id.interstitials_container);
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
        afov afovVar = new afov(this.a.b.b);
        afovVar.setLayoutParams(new ajf(viewGroup.getLayoutParams()));
        B.getLayoutInflater().inflate(R.layout.social_suggestions_bottom_sheet, afovVar);
        viewGroup.addView(afovVar);
        ViewGroup viewGroup2 = (ViewGroup) afovVar.findViewById(R.id.social_suggestions_bottom_sheet_container);
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a);
        apzg apzgVar = (apzg) aopcVar.mo39build();
        afpu afpuVar = this.e.containsKey(awsxVar.c) ? ((afpd) this.e.get(awsxVar.c)).a : null;
        afpt afptVar = this.v;
        afoy afoyVar = this.a;
        acti actiVar = this.p;
        avvq avvqVar = avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO;
        boolean z = this.u;
        Context context = (Context) afptVar.a.get();
        context.getClass();
        afqh afqhVar = (afqh) afptVar.b.get();
        afqhVar.getClass();
        afoyVar.getClass();
        viewGroup2.getClass();
        apzgVar.getClass();
        actiVar.getClass();
        avvqVar.getClass();
        afps afpsVar = new afps(context, afqhVar, afovVar, afoyVar, awsxVar, viewGroup2, actiVar, avvqVar, afpuVar, z);
        this.d = afpsVar;
        afovVar.i = afpsVar;
        this.t = afovVar;
        this.d.p = this;
        this.i.post(new afpb(this, 2));
    }

    final awsx a(Editable editable, int i) {
        List list = this.g;
        if (list != null && !list.isEmpty()) {
            for (awsx awsxVar : this.g) {
                String str = awsxVar.c;
                if (i >= str.length() && str.contentEquals(editable.subSequence(i - str.length(), i))) {
                    return awsxVar;
                }
            }
            return null;
        }
        List<String> list2 = this.f;
        if (list2 == null) {
            return null;
        }
        for (String str2 : list2) {
            if (i >= str2.length() && str2.contentEquals(editable.subSequence(i - str2.length(), i))) {
                aopa createBuilder = awsx.a.createBuilder();
                createBuilder.copyOnWrite();
                awsx awsxVar2 = (awsx) createBuilder.instance;
                str2.getClass();
                awsxVar2.b |= 1;
                awsxVar2.c = str2;
                return (awsx) createBuilder.mo39build();
            }
        }
        return null;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        Object[] spans;
        final Editable editable2 = editable;
        int i2 = 1;
        if (editable2 == null || editable.length() == 0) {
            this.j = null;
            this.k = false;
            this.i.post(new afpb(this, 1));
            return;
        }
        ajwp[] ajwpVarArr = this.j;
        if (ajwpVarArr != null) {
            if (this.k) {
                for (ajwp ajwpVar : ajwpVarArr) {
                    this.i.post(new afpa(editable2, ajwpVar));
                }
            } else {
                for (ajwp ajwpVar2 : ajwpVarArr) {
                    editable2.removeSpan(ajwpVar2);
                }
            }
        }
        if (this.b) {
            final int length = editable.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else if (editable2.charAt(length) == '\n') {
                    final int i3 = length + 1;
                    this.i.post(new Runnable() { // from class: afoz
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = length;
                            Editable editable3 = editable2;
                            int i5 = i3;
                            if (i4 > editable3.length() || i5 > editable3.length()) {
                                return;
                            }
                            editable3.delete(i4, i5);
                        }
                    });
                }
            }
        }
        if (this.c != null && (editable2 instanceof SpannableStringBuilder)) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) editable2;
            ArrayList arrayList = this.s;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    spannableStringBuilder.removeSpan(arrayList.get(i4));
                }
            }
            this.s = new ArrayList();
            ArrayList arrayList2 = this.c;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                awsu awsuVar = (awsu) arrayList2.get(i5);
                Pattern compile = Pattern.compile(awsuVar.b);
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                Matcher matcher = compile.matcher(editable2);
                int i6 = 0;
                while (true) {
                    i = i5 + 1;
                    if (matcher.find()) {
                        String group = matcher.group();
                        int indexOf = spannableStringBuilder2.indexOf(group, i6);
                        aopa createBuilder = awma.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awma awmaVar = (awma) createBuilder.instance;
                        awmaVar.b |= i2;
                        awmaVar.c = "a";
                        awmd awmdVar = awsuVar.c;
                        if (awmdVar == null) {
                            awmdVar = awmd.a;
                        }
                        createBuilder.copyOnWrite();
                        awma awmaVar2 = (awma) createBuilder.instance;
                        awmdVar.getClass();
                        aopu aopuVar = awmaVar2.f;
                        if (!aopuVar.c()) {
                            awmaVar2.f = aopi.mutableCopy(aopuVar);
                        }
                        awmaVar2.f.add(awmdVar);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(afnw.b(this.o, this.l, (awma) createBuilder.mo39build(), this.r, this.m, this.n));
                        for (Object obj : spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), Object.class)) {
                            this.s.add(obj);
                            spannableStringBuilder.setSpan(obj, indexOf, group.length() + indexOf, 33);
                        }
                        i6 = indexOf + group.length();
                        i2 = 1;
                    }
                }
                editable2 = editable;
                i5 = i;
            }
        }
        if (this.a.b != null) {
            this.i.post(new afpb(this));
        }
        this.j = null;
        this.k = false;
    }

    public final void b() {
        CoordinatorLayout coordinatorLayout;
        ViewGroup viewGroup = (ViewGroup) zew.B(this.a.b.b).getWindow().findViewById(R.id.interstitials_container);
        if (viewGroup == null || (coordinatorLayout = this.t) == null) {
            return;
        }
        viewGroup.removeView(coordinatorLayout);
        this.t.removeAllViews();
        this.d = null;
        this.t = null;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            this.j = (ajwp[]) spanned.getSpans(i, i2 + i, ajwp.class);
            this.k = true;
        } else if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
        } else {
            ajwp[] ajwpVarArr = (ajwp[]) spanned.getSpans(i - 1, i, ajwp.class);
            ajwp[] ajwpVarArr2 = (ajwp[]) spanned.getSpans(i, i + 1, ajwp.class);
            if (ajwpVarArr == null || ajwpVarArr.length == 0 || ajwpVarArr2 == null || ajwpVarArr2.length == 0 || !ajwpVarArr[0].b.contentEquals(ajwpVarArr2[0].b)) {
                return;
            }
            this.j = ajwpVarArr2;
            this.k = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        awsx a;
        awmt awmtVar = this.q;
        if (awmtVar != null) {
            this.r.b(awmtVar, afpe.b(this.a)).Q();
        }
        if (this.d != null) {
            awsx a2 = a(this.a.mo589getText(), this.a.getSelectionStart());
            if (a2 != null) {
                if (!a2.equals(this.d.q) || !afpe.a.contains(a2.c)) {
                    if (a2.c.equals("@") && this.d.q.c.equals("#")) {
                        this.d.a();
                        c(a2);
                    }
                } else {
                    afps afpsVar = this.d;
                    if (afpsVar.k != null) {
                        afpsVar.b.getText().removeSpan(afpsVar.k);
                    }
                    int selectionStart = afpsVar.b.getSelectionStart();
                    afpsVar.k = new MdeSuggestBottomSheetController$CandidateChipSpan();
                    afpsVar.b.getText().setSpan(afpsVar.k, selectionStart - afpsVar.q.c.length(), selectionStart, 34);
                }
            }
            this.d.c();
        } else if (this.v == null) {
        } else {
            int selectionStart2 = this.a.getSelectionStart();
            if ((selectionStart2 == this.a.getSelectionEnd() && selectionStart2 <= 0) || (a = a(this.a.mo589getText(), selectionStart2)) == null) {
                return;
            }
            c(a);
        }
    }
}
