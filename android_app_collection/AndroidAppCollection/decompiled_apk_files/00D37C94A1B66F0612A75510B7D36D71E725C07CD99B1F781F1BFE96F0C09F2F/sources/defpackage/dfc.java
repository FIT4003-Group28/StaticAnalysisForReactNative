package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.List;
/* compiled from: PG */
/* renamed from: dfc  reason: default package */
/* loaded from: classes3.dex */
final class dfc implements dfe {
    private final /* synthetic */ int a;

    public dfc() {
    }

    public dfc(int i) {
        this.a = i;
    }

    @Override // defpackage.dfe
    public final String b() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "y" : "x" : "width" : "scale" : "rotation" : "alpha" : "height";
    }

    @Override // defpackage.dfe
    public final float e(dbn dbnVar) {
        int height;
        dab dabVar;
        dab dabVar2;
        dab dabVar3;
        int i = this.a;
        if (i == 0) {
            height = dbnVar.c.height();
        } else if (i == 1) {
            dab dabVar4 = dbnVar.l;
            if (dabVar4 != null && dabVar4.t() && (dabVar = dbnVar.l) != null) {
                return dabVar.f;
            }
            return 1.0f;
        } else if (i == 2) {
            dab dabVar5 = dbnVar.l;
            if (dabVar5 != null && dabVar5.v() && (dabVar2 = dbnVar.l) != null) {
                return dabVar2.g;
            }
            return 0.0f;
        } else if (i == 3) {
            dab dabVar6 = dbnVar.l;
            if (dabVar6 != null && dabVar6.y() && (dabVar3 = dbnVar.l) != null) {
                return dabVar3.e;
            }
            return 1.0f;
        } else if (i == 4) {
            height = dbnVar.c.width();
        } else if (i == 5) {
            height = dbnVar.c.left;
        } else {
            height = dbnVar.c.top;
        }
        return height;
    }

    @Override // defpackage.dfe
    public final void c(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                d(obj, 1.0f);
            } else if (i == 2) {
                dfd.b(obj, this).setRotation(0.0f);
            } else if (i == 3) {
                View b = dfd.b(obj, this);
                b.setScaleX(1.0f);
                b.setScaleY(1.0f);
            } else if (i == 4) {
            } else {
                if (i == 5) {
                    if (!(obj instanceof View)) {
                        return;
                    }
                    ((View) obj).setTranslationX(0.0f);
                } else if (!(obj instanceof View)) {
                } else {
                    ((View) obj).setTranslationY(0.0f);
                }
            }
        }
    }

    @Override // defpackage.dfe
    public final float a(Object obj) {
        int height;
        int width;
        int i = this.a;
        if (i == 0) {
            if (obj instanceof View) {
                height = ((View) obj).getHeight();
            } else if (obj instanceof Drawable) {
                height = ((Drawable) obj).getBounds().height();
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Getting height from unsupported mount content: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
            return height;
        } else if (i == 1) {
            if (obj instanceof View) {
                return ((View) obj).getAlpha();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
            sb2.append("Tried to get alpha of unsupported mount content: ");
            sb2.append(valueOf2);
            throw new UnsupportedOperationException(sb2.toString());
        } else if (i == 2) {
            return dfd.b(obj, this).getRotation();
        } else {
            if (i == 3) {
                View b = dfd.b(obj, this);
                float scaleX = b.getScaleX();
                if (scaleX != b.getScaleY()) {
                    throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
                }
                return scaleX;
            } else if (i == 4) {
                if (obj instanceof View) {
                    width = ((View) obj).getWidth();
                } else if (obj instanceof Drawable) {
                    width = ((Drawable) obj).getBounds().width();
                } else {
                    String valueOf3 = String.valueOf(obj);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                    sb3.append("Getting width from unsupported mount content: ");
                    sb3.append(valueOf3);
                    throw new UnsupportedOperationException(sb3.toString());
                }
                return width;
            } else if (i == 5) {
                if (obj instanceof dci) {
                    return ((dci) obj).getX();
                }
                if (obj instanceof View) {
                    return dfd.a((View) obj, true);
                }
                if (obj instanceof Drawable) {
                    Drawable drawable = (Drawable) obj;
                    return drawable.getBounds().left + dfd.a(dfd.c(drawable), true);
                }
                String valueOf4 = String.valueOf(obj);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 42);
                sb4.append("Getting X from unsupported mount content: ");
                sb4.append(valueOf4);
                throw new UnsupportedOperationException(sb4.toString());
            } else if (obj instanceof dci) {
                return ((dci) obj).getY();
            } else {
                if (obj instanceof View) {
                    return dfd.a((View) obj, false);
                }
                if (obj instanceof Drawable) {
                    Drawable drawable2 = (Drawable) obj;
                    return drawable2.getBounds().top + dfd.a(dfd.c(drawable2), false);
                }
                String valueOf5 = String.valueOf(obj);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 42);
                sb5.append("Getting Y from unsupported mount content: ");
                sb5.append(valueOf5);
                throw new UnsupportedOperationException(sb5.toString());
            }
        }
    }

    @Override // defpackage.dfe
    public final void d(Object obj, float f) {
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) obj;
                if (componentHost instanceof dci) {
                    dci dciVar = (dci) componentHost;
                    dciVar.x = (int) f;
                    dciVar.requestLayout();
                } else {
                    int top = componentHost.getTop();
                    hz.v(componentHost, componentHost.getLeft(), top, componentHost.getRight(), (int) (top + f), false);
                }
                List f2 = componentHost.f();
                if (f2 == null) {
                    return;
                }
                int width = componentHost.getWidth();
                int i3 = (int) f;
                while (i2 < f2.size()) {
                    hz.w((Drawable) f2.get(i2), width, i3);
                    i2++;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                int top2 = view.getTop();
                hz.v(view, view.getLeft(), top2, view.getRight(), (int) (top2 + f), false);
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                hz.w(drawable, drawable.getBounds().width(), (int) f);
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Setting height on unsupported mount content: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
        } else if (i == 1) {
            if (obj instanceof View) {
                ((View) obj).setAlpha(f);
                return;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
            sb2.append("Setting alpha on unsupported mount content: ");
            sb2.append(valueOf2);
            throw new UnsupportedOperationException(sb2.toString());
        } else if (i == 2) {
            dfd.b(obj, this).setRotation(f);
        } else if (i == 3) {
            View b = dfd.b(obj, this);
            b.setScaleX(f);
            b.setScaleY(f);
        } else if (i == 4) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost2 = (ComponentHost) obj;
                if (componentHost2 instanceof dci) {
                    dci dciVar2 = (dci) componentHost2;
                    dciVar2.w = (int) f;
                    dciVar2.requestLayout();
                } else {
                    int left = componentHost2.getLeft();
                    hz.v(componentHost2, left, componentHost2.getTop(), (int) (left + f), componentHost2.getBottom(), false);
                }
                List f3 = componentHost2.f();
                if (f3 == null) {
                    return;
                }
                int i4 = (int) f;
                int height = componentHost2.getHeight();
                while (i2 < f3.size()) {
                    hz.w((Drawable) f3.get(i2), i4, height);
                    i2++;
                }
            } else if (obj instanceof View) {
                View view2 = (View) obj;
                int left2 = view2.getLeft();
                hz.v(view2, left2, view2.getTop(), (int) (left2 + f), view2.getBottom(), false);
            } else if (obj instanceof Drawable) {
                Drawable drawable2 = (Drawable) obj;
                hz.w(drawable2, (int) f, drawable2.getBounds().height());
            } else {
                String valueOf3 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 44);
                sb3.append("Setting width on unsupported mount content: ");
                sb3.append(valueOf3);
                throw new UnsupportedOperationException(sb3.toString());
            }
        } else if (i == 5) {
            if (obj instanceof dci) {
                ((View) obj).setX(f);
            } else if (obj instanceof View) {
                View view3 = (View) obj;
                view3.setX(f - dfd.a((View) view3.getParent(), true));
            } else if (obj instanceof Drawable) {
                Drawable drawable3 = (Drawable) obj;
                hz.x(drawable3, (int) (f - dfd.a(dfd.c(drawable3), true)), drawable3.getBounds().top);
            } else {
                String valueOf4 = String.valueOf(obj);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
                sb4.append("Setting X on unsupported mount content: ");
                sb4.append(valueOf4);
                throw new UnsupportedOperationException(sb4.toString());
            }
        } else if (obj instanceof dci) {
            ((View) obj).setY(f);
        } else if (obj instanceof View) {
            View view4 = (View) obj;
            view4.setY(f - dfd.a((View) view4.getParent(), false));
        } else if (obj instanceof Drawable) {
            Drawable drawable4 = (Drawable) obj;
            hz.x(drawable4, drawable4.getBounds().left, (int) (f - dfd.a(dfd.c(drawable4), false)));
        } else {
            String valueOf5 = String.valueOf(obj);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 40);
            sb5.append("Setting Y on unsupported mount content: ");
            sb5.append(valueOf5);
            throw new UnsupportedOperationException(sb5.toString());
        }
    }
}
