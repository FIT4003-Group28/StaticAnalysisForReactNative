package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahat  reason: default package */
/* loaded from: classes.dex */
public final class ahat implements ahcd, ynl {
    private static final int[] f = {R.attr.backgroundSecondaryInverse, R.attr.colorPrimaryAlternate, R.attr.selectableItemBackground, R.attr.textAppearanceBody1, R.attr.textAppearanceButton, R.attr.textAppearanceTitle, R.attr.textAppearanceSubhead};
    protected final Activity a;
    protected final aafo b;
    protected final ajmr c;
    public ahap d;
    protected ahas e;
    private final ajxz g;
    private aham h;

    public ahat(Activity activity, ajxz ajxzVar, aafo aafoVar, ajmr ajmrVar) {
        this.a = activity;
        ajxzVar.getClass();
        this.g = ajxzVar;
        aafoVar.getClass();
        this.b = aafoVar;
        ajmrVar.getClass();
        this.c = ajmrVar;
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f);
        for (int i = 0; i < 7; i++) {
            if (obtainStyledAttributes.getResourceId(i, -1) == -1) {
                String valueOf = String.valueOf(activity.getResources().getResourceEntryName(f[i]));
                throw new IllegalStateException(valueOf.length() != 0 ? "Resource attribute required but not provided ".concat(valueOf) : new String("Resource attribute required but not provided "));
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.ahcd
    public final void a(Object obj, acti actiVar, final Pair pair, final ahda ahdaVar) {
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        apoj apojVar2;
        arag aragVar3;
        arag aragVar4;
        int i;
        arag aragVar5;
        arag aragVar6;
        apoj apojVar3;
        apoj apojVar4;
        ImageView imageView;
        if (obj == null) {
            return;
        }
        if (obj instanceof avvh) {
            avvh avvhVar = (avvh) obj;
            if (avvhVar.k) {
                if (this.e == null) {
                    this.e = new ahas(this.a, b(), this.b, this.c);
                }
                final ahas ahasVar = this.e;
                ahasVar.e = LayoutInflater.from(ahasVar.a).inflate(R.layout.upsell_dialog_with_header_images, (ViewGroup) null);
                ahasVar.f = (ImageView) ahasVar.e.findViewById(R.id.background_image);
                ahasVar.g = (ImageView) ahasVar.e.findViewById(R.id.logo);
                ahasVar.h = new ajnj(ahasVar.d, ahasVar.f);
                ahasVar.i = new ajnj(ahasVar.d, ahasVar.g);
                ahasVar.j = (TextView) ahasVar.e.findViewById(R.id.dialog_title);
                ahasVar.k = (TextView) ahasVar.e.findViewById(R.id.dialog_message);
                ahasVar.m = (TextView) ahasVar.e.findViewById(R.id.action_button);
                ahasVar.n = (TextView) ahasVar.e.findViewById(R.id.dismiss_button);
                ahasVar.l = ahasVar.b.setView(ahasVar.e).create();
                ahasVar.l.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ahaq
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ahas ahasVar2 = ahas.this;
                        ahasVar2.a(ahasVar2.p);
                    }
                });
                ahasVar.q = actiVar;
                if ((avvhVar.b & 2) == 0) {
                    ahasVar.f.setVisibility(8);
                    ahasVar.h.a();
                } else {
                    ahasVar.f.setVisibility(0);
                    ajnj ajnjVar = ahasVar.h;
                    avhn avhnVar = avvhVar.d;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    ajnjVar.k(avhnVar);
                }
                if ((avvhVar.b & 1) != 0) {
                    avhn avhnVar2 = avvhVar.c;
                    if (avhnVar2 == null) {
                        avhnVar2 = avhn.a;
                    }
                    avhm y = akel.y(avhnVar2);
                    if (y != null) {
                        int i2 = y.d;
                        int i3 = y.e;
                        zgd.t(ahasVar.g, zgd.r((int) ((i2 / i3) * imageView.getLayoutParams().height)), ViewGroup.LayoutParams.class);
                    }
                    ahasVar.g.setVisibility(0);
                    ajnj ajnjVar2 = ahasVar.i;
                    avhn avhnVar3 = avvhVar.c;
                    if (avhnVar3 == null) {
                        avhnVar3 = avhn.a;
                    }
                    ajnjVar2.k(avhnVar3);
                } else {
                    ahasVar.g.setVisibility(8);
                    ahasVar.i.a();
                }
                TextView textView = ahasVar.j;
                if ((8 & avvhVar.b) != 0) {
                    aragVar5 = avvhVar.e;
                    if (aragVar5 == null) {
                        aragVar5 = arag.a;
                    }
                } else {
                    aragVar5 = null;
                }
                zag.m(textView, ajgl.b(aragVar5));
                TextView textView2 = ahasVar.k;
                if ((avvhVar.b & 16) != 0) {
                    aragVar6 = avvhVar.f;
                    if (aragVar6 == null) {
                        aragVar6 = arag.a;
                    }
                } else {
                    aragVar6 = null;
                }
                zag.m(textView2, ajgl.b(aragVar6));
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ahar
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        apoj apojVar5;
                        ahas ahasVar2 = ahas.this;
                        ahda ahdaVar2 = ahdaVar;
                        if (view == ahasVar2.m) {
                            if (ahdaVar2 != null) {
                                ahdaVar2.b();
                            }
                            apojVar5 = ahasVar2.o;
                        } else if (view == ahasVar2.n) {
                            if (ahdaVar2 != null) {
                                ahdaVar2.a();
                            }
                            apojVar5 = ahasVar2.p;
                        } else {
                            apojVar5 = null;
                        }
                        ahasVar2.a(apojVar5);
                        ahasVar2.l.dismiss();
                    }
                };
                apok apokVar = avvhVar.h;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                if ((apokVar.b & 1) != 0) {
                    apok apokVar2 = avvhVar.h;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apojVar3 = apokVar2.c;
                    if (apojVar3 == null) {
                        apojVar3 = apoj.a;
                    }
                } else {
                    apojVar3 = null;
                }
                ahasVar.p = apojVar3;
                apok apokVar3 = avvhVar.g;
                if (apokVar3 == null) {
                    apokVar3 = apok.a;
                }
                if ((apokVar3.b & 1) != 0) {
                    apok apokVar4 = avvhVar.g;
                    if (apokVar4 == null) {
                        apokVar4 = apok.a;
                    }
                    apojVar4 = apokVar4.c;
                    if (apojVar4 == null) {
                        apojVar4 = apoj.a;
                    }
                } else {
                    apojVar4 = null;
                }
                ahasVar.o = apojVar4;
                if (ahasVar.p != null || ahasVar.o != null) {
                    ahasVar.c(ahasVar.o, ahasVar.m, onClickListener);
                    ahasVar.c(ahasVar.p, ahasVar.n, onClickListener);
                } else {
                    zag.m(ahasVar.n, ahasVar.a.getResources().getText(R.string.cancel));
                    zag.o(ahasVar.m, false);
                }
                ahasVar.l.show();
                ahas.b(ahasVar.c, avvhVar);
            } else {
                ahas.b(this.b, avvhVar);
            }
            if (actiVar == null) {
                return;
            }
            actiVar.u(new acte(avvhVar.i), null);
        } else if (obj instanceof aqmu) {
            if (this.d == null) {
                this.d = new ahap(this.a, b());
            }
            final ahap ahapVar = this.d;
            aqmu aqmuVar = (aqmu) obj;
            ajxz ajxzVar = this.g;
            if (pair != null) {
                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ahao
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ahap ahapVar2 = ahap.this;
                        ahda ahdaVar2 = ahdaVar;
                        Pair pair2 = pair;
                        if (i4 == -1) {
                            if (ahdaVar2 != null) {
                                ahdaVar2.b();
                            }
                            ((Runnable) pair2.second).run();
                        } else if (i4 == -2 && ahdaVar2 != null) {
                            ahdaVar2.a();
                        }
                        ahapVar2.a();
                    }
                };
                ahapVar.b.setButton(-1, (CharSequence) pair.first, onClickListener2);
                ahapVar.b.setButton(-2, ahapVar.a.getResources().getText(R.string.dismiss), onClickListener2);
            } else {
                ahapVar.b.setButton(-2, ahapVar.a.getResources().getText(R.string.dismiss), new DialogInterface.OnClickListener() { // from class: ahan
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ahap ahapVar2 = ahap.this;
                        ahda ahdaVar2 = ahdaVar;
                        if (ahdaVar2 != null) {
                            ahdaVar2.a();
                        }
                        ahapVar2.a();
                    }
                });
            }
            ahapVar.d.setText(aqmuVar.e);
            if ((aqmuVar.b & 1) != 0) {
                arhs arhsVar = aqmuVar.c;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                i = ajxzVar.a(b);
            } else {
                i = 0;
            }
            if (!aqmuVar.d.isEmpty() || i != 0) {
                ahapVar.g.setVisibility(0);
                ahapVar.f.setVisibility(0);
                zag.m(ahapVar.c, aqmuVar.d);
                if (i == 0) {
                    ahapVar.e.setVisibility(8);
                } else {
                    ahapVar.e.setImageResource(i);
                    ahapVar.e.setVisibility(0);
                }
            } else {
                ahapVar.g.setVisibility(8);
                ahapVar.f.setVisibility(8);
            }
            ahapVar.b.show();
            Window window = ahapVar.b.getWindow();
            if (window != null) {
                window.setLayout((int) ahapVar.a.getResources().getDimension(R.dimen.upsell_dialog_width), -2);
            }
            if (actiVar == null) {
                return;
            }
            actiVar.u(new acte(aqmuVar.h), null);
        } else if (!(obj instanceof aqft)) {
        } else {
            if (this.h == null) {
                this.h = new aham(this.a, b(), this.b);
            }
            aqft aqftVar = (aqft) obj;
            if (actiVar != null) {
                actiVar.u(new acte(aqftVar.n), null);
            }
            final aham ahamVar = this.h;
            ahamVar.f = actiVar;
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: ahal
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    apoj apojVar5;
                    acti actiVar2;
                    aham ahamVar2 = aham.this;
                    ahda ahdaVar2 = ahdaVar;
                    if (i4 == -1) {
                        if (ahdaVar2 != null) {
                            ahdaVar2.b();
                        }
                        apojVar5 = ahamVar2.g;
                    } else if (i4 == -2) {
                        if (ahdaVar2 != null) {
                            ahdaVar2.a();
                        }
                        apojVar5 = ahamVar2.h;
                    } else {
                        apojVar5 = null;
                    }
                    if (apojVar5 != null && ahamVar2.f != null) {
                        if ((apojVar5.b & 16384) != 0) {
                            apzg apzgVar = apojVar5.o;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            if (!apzgVar.qn(atno.b) && (actiVar2 = ahamVar2.f) != null) {
                                apzgVar = actiVar2.f(apzgVar);
                            }
                            if (apzgVar != null) {
                                ahamVar2.b.c(apzgVar, null);
                            }
                        }
                        if ((apojVar5.b & 8192) != 0) {
                            aafo aafoVar = ahamVar2.b;
                            apzg apzgVar2 = apojVar5.n;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            aafoVar.c(apzgVar2, actk.h(apojVar5, !((apojVar5.b & 16384) != 0)));
                        }
                    }
                    dialogInterface.dismiss();
                }
            };
            ahamVar.c.setButton(-1, ahamVar.a.getResources().getText(R.string.ok), onClickListener3);
            ahamVar.c.setButton(-2, ahamVar.a.getResources().getText(R.string.cancel), onClickListener3);
            TextView textView3 = ahamVar.d;
            if ((aqftVar.b & 1) != 0) {
                aragVar = aqftVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView3, ajgl.b(aragVar));
            TextView textView4 = ahamVar.e;
            if ((aqftVar.b & 67108864) != 0) {
                aragVar2 = aqftVar.u;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            zag.m(textView4, ajgl.b(aragVar2));
            ahamVar.c.show();
            apok apokVar5 = aqftVar.i;
            if (apokVar5 == null) {
                apokVar5 = apok.a;
            }
            if ((apokVar5.b & 1) != 0) {
                apok apokVar6 = aqftVar.i;
                if (apokVar6 == null) {
                    apokVar6 = apok.a;
                }
                apojVar = apokVar6.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            } else {
                apojVar = null;
            }
            apok apokVar7 = aqftVar.h;
            if (apokVar7 == null) {
                apokVar7 = apok.a;
            }
            if ((apokVar7.b & 1) != 0) {
                apok apokVar8 = aqftVar.h;
                if (apokVar8 == null) {
                    apokVar8 = apok.a;
                }
                apojVar2 = apokVar8.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
            } else {
                apojVar2 = null;
            }
            if (apojVar != null) {
                Button button = ahamVar.c.getButton(-2);
                if ((apojVar.b & 256) != 0) {
                    aragVar4 = apojVar.i;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                } else {
                    aragVar4 = null;
                }
                button.setText(ajgl.b(aragVar4));
                ahamVar.c.getButton(-2).setTextColor(zhn.d(ahamVar.a, R.attr.ytCallToAction));
                if (actiVar != null) {
                    actiVar.u(new acte(apojVar.t), null);
                }
            } else if (apojVar2 != null) {
                ahamVar.c.getButton(-2).setVisibility(8);
            }
            if (apojVar2 != null) {
                Button button2 = ahamVar.c.getButton(-1);
                if ((apojVar2.b & 256) != 0) {
                    aragVar3 = apojVar2.i;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                button2.setText(ajgl.b(aragVar3));
                ahamVar.c.getButton(-1).setTextColor(zhn.d(ahamVar.a, R.attr.ytCallToAction));
                if (actiVar != null) {
                    actiVar.u(new acte(apojVar2.t), null);
                }
            } else {
                ahamVar.c.getButton(-1).setVisibility(8);
            }
            ahamVar.h = apojVar;
            ahamVar.g = apojVar2;
        }
    }

    protected final AlertDialog.Builder b() {
        return new AlertDialog.Builder(this.a);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                ahas ahasVar = this.e;
                if (ahasVar != null && ahasVar.l.isShowing()) {
                    ahasVar.l.cancel();
                }
                ahap ahapVar = this.d;
                if (ahapVar == null) {
                    return null;
                }
                ahapVar.a();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }
}
