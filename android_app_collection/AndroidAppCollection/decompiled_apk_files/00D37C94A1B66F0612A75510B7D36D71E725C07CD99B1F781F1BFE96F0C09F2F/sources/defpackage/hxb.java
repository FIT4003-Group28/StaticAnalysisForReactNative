package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: hxb  reason: default package */
/* loaded from: classes3.dex */
public class hxb {
    public static hxa c() {
        return new hxa(ReelWatchActivity.class);
    }

    public static void d(final Activity activity, final Bitmap bitmap, final axbl axblVar, final hvg hvgVar) {
        aakr.e(activity, bitmap, new zov() { // from class: hvf
            @Override // defpackage.zov
            public final void a(zqz zqzVar) {
                Activity activity2 = activity;
                axbl axblVar2 = axblVar;
                hvg hvgVar2 = hvgVar;
                Bitmap bitmap2 = bitmap;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                aopa createBuilder = awzs.a.createBuilder();
                String str = zqzVar.c;
                createBuilder.copyOnWrite();
                awzs awzsVar = (awzs) createBuilder.instance;
                str.getClass();
                awzsVar.b = 1;
                awzsVar.c = str;
                awzs awzsVar2 = (awzs) createBuilder.mo39build();
                aopa mo52toBuilder = ((axbm) axblVar2.instance).i().mo52toBuilder();
                axbk axbkVar = (axbk) mo52toBuilder.instance;
                int i = axbkVar.c;
                if (i == 3) {
                    aopa mo52toBuilder2 = ((axba) axbkVar.d).mo52toBuilder();
                    mo52toBuilder2.copyOnWrite();
                    axba axbaVar = (axba) mo52toBuilder2.instance;
                    awzsVar2.getClass();
                    axbaVar.c = awzsVar2;
                    axbaVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar2 = (axbk) mo52toBuilder.instance;
                    axba axbaVar2 = (axba) mo52toBuilder2.mo39build();
                    axbaVar2.getClass();
                    axbkVar2.d = axbaVar2;
                    axbkVar2.c = 3;
                } else if (i == 6) {
                    aopa mo52toBuilder3 = ((awzu) axbkVar.d).mo52toBuilder();
                    mo52toBuilder3.copyOnWrite();
                    awzu awzuVar = (awzu) mo52toBuilder3.instance;
                    awzsVar2.getClass();
                    awzuVar.c = awzsVar2;
                    awzuVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar3 = (axbk) mo52toBuilder.instance;
                    awzu awzuVar2 = (awzu) mo52toBuilder3.mo39build();
                    awzuVar2.getClass();
                    axbkVar3.d = awzuVar2;
                    axbkVar3.c = 6;
                } else if (i == 7) {
                    aopa mo52toBuilder4 = ((axcg) axbkVar.d).mo52toBuilder();
                    mo52toBuilder4.copyOnWrite();
                    axcg axcgVar = (axcg) mo52toBuilder4.instance;
                    awzsVar2.getClass();
                    axcgVar.c = awzsVar2;
                    axcgVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar4 = (axbk) mo52toBuilder.instance;
                    axcg axcgVar2 = (axcg) mo52toBuilder4.mo39build();
                    axcgVar2.getClass();
                    axbkVar4.d = axcgVar2;
                    axbkVar4.c = 7;
                } else if (i == 1) {
                    aopa mo52toBuilder5 = ((axca) axbkVar.d).mo52toBuilder();
                    mo52toBuilder5.copyOnWrite();
                    axca axcaVar = (axca) mo52toBuilder5.instance;
                    awzsVar2.getClass();
                    axcaVar.g = awzsVar2;
                    axcaVar.b |= 128;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar5 = (axbk) mo52toBuilder.instance;
                    axca axcaVar2 = (axca) mo52toBuilder5.mo39build();
                    axcaVar2.getClass();
                    axbkVar5.d = axcaVar2;
                    axbkVar5.c = 1;
                } else if (i == 8) {
                    aopa mo52toBuilder6 = ((axcb) axbkVar.d).mo52toBuilder();
                    mo52toBuilder6.copyOnWrite();
                    axcb axcbVar = (axcb) mo52toBuilder6.instance;
                    awzsVar2.getClass();
                    axcbVar.c = awzsVar2;
                    axcbVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar6 = (axbk) mo52toBuilder.instance;
                    axcb axcbVar2 = (axcb) mo52toBuilder6.mo39build();
                    axcbVar2.getClass();
                    axbkVar6.d = axcbVar2;
                    axbkVar6.c = 8;
                } else if (i == 9) {
                    aopa mo52toBuilder7 = ((axab) axbkVar.d).mo52toBuilder();
                    mo52toBuilder7.copyOnWrite();
                    axab axabVar = (axab) mo52toBuilder7.instance;
                    awzsVar2.getClass();
                    axabVar.c = awzsVar2;
                    axabVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar7 = (axbk) mo52toBuilder.instance;
                    axab axabVar2 = (axab) mo52toBuilder7.mo39build();
                    axabVar2.getClass();
                    axbkVar7.d = axabVar2;
                    axbkVar7.c = 9;
                } else if (i == 10) {
                    aopa mo52toBuilder8 = ((axck) axbkVar.d).mo52toBuilder();
                    mo52toBuilder8.copyOnWrite();
                    axck axckVar = (axck) mo52toBuilder8.instance;
                    awzsVar2.getClass();
                    axckVar.c = awzsVar2;
                    axckVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar8 = (axbk) mo52toBuilder.instance;
                    axck axckVar2 = (axck) mo52toBuilder8.mo39build();
                    axckVar2.getClass();
                    axbkVar8.d = axckVar2;
                    axbkVar8.c = 10;
                } else if (i == 12) {
                    aopa mo52toBuilder9 = ((axac) axbkVar.d).mo52toBuilder();
                    mo52toBuilder9.copyOnWrite();
                    axac axacVar = (axac) mo52toBuilder9.instance;
                    awzsVar2.getClass();
                    axacVar.c = awzsVar2;
                    axacVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar9 = (axbk) mo52toBuilder.instance;
                    axac axacVar2 = (axac) mo52toBuilder9.mo39build();
                    axacVar2.getClass();
                    axbkVar9.d = axacVar2;
                    axbkVar9.c = 12;
                } else if (i == 13) {
                    aopa mo52toBuilder10 = ((axay) axbkVar.d).mo52toBuilder();
                    mo52toBuilder10.copyOnWrite();
                    axay axayVar = (axay) mo52toBuilder10.instance;
                    awzsVar2.getClass();
                    axayVar.c = awzsVar2;
                    axayVar.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    axbk axbkVar10 = (axbk) mo52toBuilder.instance;
                    axay axayVar2 = (axay) mo52toBuilder10.mo39build();
                    axayVar2.getClass();
                    axbkVar10.d = axayVar2;
                    axbkVar10.c = 13;
                }
                axblVar2.copyOnWrite();
                ((axbm) axblVar2.instance).F((axbk) mo52toBuilder.mo39build());
                aahp.g(axblVar2, zqzVar);
                hvgVar2.a(axblVar2);
                bitmap2.recycle();
            }
        });
    }

    public static void e(Activity activity, aakr aakrVar, View view, axbl axblVar, hvg hvgVar) {
        d(activity, aakr.c(activity, view), axblVar, hvgVar);
    }

    public static View f(Context context, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(true != z ? R.layout.hats_horizontal_survey_option : R.layout.hats_vertical_survey_option, viewGroup, false);
    }

    public static CharSequence g(List list) {
        Spanned spanned;
        avdp avdpVar;
        int size = list.size();
        do {
            size--;
            spanned = null;
            arag aragVar = null;
            if (size < 0) {
                break;
            }
            avdr avdrVar = (avdr) list.get(size);
            if (avdrVar.b == 84469192) {
                avdpVar = (avdp) avdrVar.c;
            } else {
                avdpVar = avdp.a;
            }
            if ((avdpVar.b & 2) != 0 && (aragVar = avdpVar.d) == null) {
                aragVar = arag.a;
            }
            spanned = ajgl.b(aragVar);
        } while (TextUtils.isEmpty(spanned));
        return spanned;
    }

    public static CharSequence h(List list) {
        avdp avdpVar;
        Spanned b;
        Iterator it = list.iterator();
        do {
            arag aragVar = null;
            if (!it.hasNext()) {
                return null;
            }
            avdr avdrVar = (avdr) it.next();
            if (avdrVar.b == 84469192) {
                avdpVar = (avdp) avdrVar.c;
            } else {
                avdpVar = avdp.a;
            }
            if ((avdpVar.b & 2) != 0 && (aragVar = avdpVar.d) == null) {
                aragVar = arag.a;
            }
            b = ajgl.b(aragVar);
        } while (TextUtils.isEmpty(b));
        return b;
    }

    public static void i(View view, avdp avdpVar, ajxz ajxzVar, View.OnClickListener onClickListener) {
        View findViewById = view.findViewById(R.id.hats_response_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.hats_response_icon);
        if (imageView == null) {
            return;
        }
        arag aragVar = null;
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            if ((avdpVar.b & 2) != 0 && (aragVar = avdpVar.d) == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        } else {
            if ((avdpVar.b & 2) != 0 && (aragVar = avdpVar.d) == null) {
                aragVar = arag.a;
            }
            imageView.setContentDescription(ajgl.b(aragVar));
        }
        boolean z = true;
        if ((avdpVar.b & 1) != 0) {
            arhs arhsVar = avdpVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
        }
        if (1 != (avdpVar.b & 1)) {
            z = false;
        }
        zag.o(imageView, z);
        view.setOnClickListener(onClickListener);
    }

    public static void j(Menu menu, MenuInflater menuInflater, yzh yzhVar, SparseArray sparseArray, int i, agbz agbzVar) {
        Drawable icon;
        int size = sparseArray.size();
        if (size == 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.clear();
        for (int i2 = 0; i2 < size; i2++) {
            fry fryVar = (fry) sparseArray.valueAt(i2);
            if (fryVar == null || fryVar.h() == 0) {
                if (fryVar instanceof fse) {
                    fse fseVar = (fse) fryVar;
                    menu.add(0, fseVar.g(), fseVar.b(), fseVar.c());
                } else {
                    zep.l(String.format("Unhandled menu item %s", fryVar));
                }
            } else {
                Integer valueOf = Integer.valueOf(fryVar.h());
                if (!hashSet.contains(valueOf)) {
                    menuInflater.inflate(valueOf.intValue(), menu);
                    hashSet.add(valueOf);
                }
            }
        }
        for (int i3 = 0; i3 < menu.size(); i3++) {
            MenuItem item = menu.getItem(i3);
            fry fryVar2 = (fry) sparseArray.get(item.getItemId());
            if (fryVar2 != null) {
                fryVar2.j(item);
                if (yzhVar != null) {
                    if (fryVar2.i() != null) {
                        fryVar2.i().a(yzhVar, i);
                    } else if (fryVar2.l() && (icon = item.getIcon()) != null) {
                        item.setIcon(yzhVar.b(icon, i));
                    }
                }
                if (agbzVar != null && (fryVar2 instanceof fse)) {
                    fse fseVar2 = (fse) fryVar2;
                    if (fseVar2.f() && !fseVar2.d().isEmpty()) {
                        String[] strArr = (String[]) fseVar2.d().toArray(new String[fseVar2.d().size()]);
                        ArrayList arrayList = new ArrayList();
                        for (String str : strArr) {
                            arrayList.add(agbzVar.b(str).A().I().n());
                        }
                        aaku aakuVar = new aaku(14);
                        int i4 = aynx.a;
                        ayrd.c(i4, "bufferSize");
                        ayum ayumVar = new ayum(arrayList, aakuVar, i4);
                        azqc.j();
                        fseVar2.e(ayumVar);
                    }
                }
            }
        }
    }

    public static apbh k(asxp asxpVar) {
        apbi apbiVar = asxpVar.s;
        if (apbiVar == null) {
            apbiVar = apbi.a;
        }
        apbh apbhVar = apbiVar.c;
        return apbhVar == null ? apbh.a : apbhVar;
    }

    public static boolean l(asxp asxpVar) {
        if ((asxpVar.b & 64) != 0) {
            apbi apbiVar = asxpVar.s;
            if (apbiVar == null) {
                apbiVar = apbi.a;
            }
            return (apbiVar.b & 4) != 0;
        }
        return false;
    }

    public void a() {
    }

    public void b(apos aposVar) {
    }
}
