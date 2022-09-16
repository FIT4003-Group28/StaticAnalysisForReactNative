package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.libraries.youtube.comment.image.ImageGridRecyclerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: xqd  reason: default package */
/* loaded from: classes4.dex */
public final class xqd extends xpf {
    public static final String[] a = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static final /* synthetic */ int ag = 0;
    public MenuItem ae;
    public Toolbar af;
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint ah;
    private ImageGridRecyclerView ai;
    private ViewStub aj;
    private View ak;
    public xrl b;
    public aufv c;
    public xqs d;
    public xqc e;

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ah = null;
        try {
            this.ah = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) aphq.i(this.m, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a, aoos.b());
        } catch (aopx e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        Cursor query = mJ().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_size", "width", "height", "orientation"}, null, null, "date_modified DESC");
        xqs xqsVar = this.d;
        xqsVar.k.b = query;
        xqsVar.f.a();
        if (query.getCount() != 0) {
            View view = this.ak;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        } else if (!ap()) {
        } else {
            if (this.ak == null) {
                this.ak = this.aj.inflate();
                Resources resources = mJ().getResources();
                this.ak.setBackgroundDrawable(new xrn(resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width), resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin), ake.d(mJ(), R.color.image_gallery_zero_state_grid_divider_color)));
            }
            this.ak.setVisibility(0);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_picker_fragment, viewGroup, false);
        aunb aunbVar = this.ah.j;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
            aunb aunbVar2 = this.ah.j;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            this.c = (aufv) aunbVar2.qm(PostImagePickerRendererOuterClass.postImagePickerRenderer);
        }
        if (this.c != null) {
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
            this.af = toolbar;
            zag.o(toolbar, true);
            yzh yzhVar = new yzh(rb());
            Toolbar toolbar2 = this.af;
            toolbar2.q(yzhVar.b(toolbar2.e(), zhn.j(rb(), R.attr.ytIconActiveOther).orElse(0)));
            Toolbar toolbar3 = this.af;
            arag aragVar = this.c.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            toolbar3.w(ajgl.b(aragVar));
            this.af.l(R.menu.image_gallery_action_menu);
            MenuItem findItem = this.af.g().findItem(R.id.next_button);
            this.ae = findItem;
            arag aragVar2 = this.c.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            findItem.setTitle(ajgl.b(aragVar2));
            this.ae.setEnabled(true ^ this.b.b().isEmpty());
            this.af.o(R.string.accessibility_close_dialog);
            this.af.q = new aaj() { // from class: xpy
                @Override // defpackage.aaj
                public final boolean a(MenuItem menuItem) {
                    int i;
                    String str;
                    Drawable drawable;
                    arif arifVar;
                    xqd xqdVar = xqd.this;
                    List<xpb> list = xqdVar.d.i;
                    amuf f = amuk.f();
                    for (xpb xpbVar : list) {
                        xro a2 = xrp.a();
                        a2.d(xpbVar.a);
                        a2.b(xpbVar.f);
                        f.h(a2.a());
                    }
                    final xrl xrlVar = xqdVar.b;
                    amuk g = f.g();
                    ylr.c();
                    HashSet hashSet = new HashSet();
                    ArrayList<xrp> arrayList = new ArrayList();
                    amzt listIterator = g.listIterator();
                    while (listIterator.hasNext()) {
                        xrp xrpVar = (xrp) listIterator.next();
                        if (!hashSet.add(xrpVar.a)) {
                            String valueOf = String.valueOf(xrpVar.a);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                            sb.append(valueOf);
                            sb.append(" already exists");
                            zep.b(sb.toString());
                        } else {
                            arrayList.add(xrpVar);
                        }
                    }
                    ArrayList<xrp> arrayList2 = new ArrayList();
                    for (xrp xrpVar2 : arrayList) {
                        if (xrlVar.g.containsKey(xrpVar2.a)) {
                            xrp xrpVar3 = (xrp) xrlVar.g.get(xrpVar2.a);
                            xro b = xrpVar2.b();
                            if (xrpVar2.d == null && (arifVar = xrpVar3.d) != null) {
                                b.b = arifVar;
                            }
                            if (xrpVar2.c == null && (drawable = xrpVar3.c) != null) {
                                b.a = drawable;
                            }
                            if (xrpVar2.f == null && (str = xrpVar3.f) != null) {
                                b.c = str;
                            }
                            if (xrpVar2.e == 0 && (i = xrpVar3.e) != 0) {
                                b.c(i);
                            }
                            xrpVar2 = b.a();
                        }
                        arrayList2.add(xrpVar2);
                    }
                    for (Uri uri : xrlVar.f) {
                        xrlVar.f(uri);
                    }
                    xrlVar.f.clear();
                    final amuf f2 = amuk.f();
                    for (xrp xrpVar4 : arrayList2) {
                        final Uri uri2 = xrpVar4.a;
                        if (xrpVar4.c == null) {
                            xrlVar.h.execute(new Runnable() { // from class: xra
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final xrl xrlVar2 = xrl.this;
                                    final Uri uri3 = uri2;
                                    xrlVar2.e.a(uri3, new xpw() { // from class: xqw
                                        @Override // defpackage.xpw
                                        public final void a(final Drawable drawable2) {
                                            final xrl xrlVar3 = xrl.this;
                                            final Uri uri4 = uri3;
                                            xrlVar3.i.execute(new Runnable() { // from class: xrb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    xrl xrlVar4 = xrl.this;
                                                    Uri uri5 = uri4;
                                                    Drawable drawable3 = drawable2;
                                                    if (!xrlVar4.f.contains(uri5)) {
                                                        return;
                                                    }
                                                    xrp xrpVar5 = (xrp) xrlVar4.g.get(uri5);
                                                    xro b2 = xrpVar5.b();
                                                    Drawable c = xxs.c(xrlVar4.d, drawable3, xrpVar5.b);
                                                    b2.a = c;
                                                    if (xrpVar5.d == null) {
                                                        b2.b = xxs.d(c.getIntrinsicWidth(), c.getIntrinsicHeight());
                                                    }
                                                    xrlVar4.g(b2.a());
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if (xrpVar4.c != null && xrpVar4.d == null) {
                            xro b2 = xrpVar4.b();
                            b2.b = xxs.d(xrpVar4.c.getIntrinsicWidth(), xrpVar4.c.getIntrinsicWidth());
                            xrpVar4 = b2.a();
                        }
                        f2.h(xrpVar4);
                        xrlVar.f.add(xrpVar4.a);
                        xrlVar.g.put(xrpVar4.a, xrpVar4);
                    }
                    xrlVar.i.execute(new Runnable() { // from class: xrd
                        @Override // java.lang.Runnable
                        public final void run() {
                            xrl.this.a.c(xrj.b(f2.g()));
                        }
                    });
                    xqdVar.mJ().onBackPressed();
                    return true;
                }
            };
            this.af.r(new View.OnClickListener() { // from class: xpz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xqd.this.mJ().onBackPressed();
                }
            });
            this.e = new xqc() { // from class: xqa
                @Override // defpackage.xqc
                public final void c(xpb xpbVar, int i) {
                    xqd xqdVar = xqd.this;
                    Toolbar toolbar4 = xqdVar.af;
                    boolean z = false;
                    if (toolbar4 != null) {
                        if (i != 0) {
                            toolbar4.w(xqdVar.rb().getResources().getQuantityString(R.plurals.image_picker_title, i, Integer.valueOf(i)));
                        } else {
                            arag aragVar3 = xqdVar.c.c;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                            toolbar4.w(ajgl.b(aragVar3));
                        }
                    }
                    MenuItem menuItem = xqdVar.ae;
                    if (menuItem != null) {
                        if (i > 0) {
                            z = true;
                        }
                        menuItem.setEnabled(z);
                    }
                }
            };
        } else {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.gallery_dismiss_button);
            zag.o(imageView, true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xpz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xqd.this.mJ().onBackPressed();
                }
            });
        }
        this.ai = (ImageGridRecyclerView) inflate.findViewById(R.id.image_grid_recycler_view);
        this.aj = (ViewStub) inflate.findViewById(R.id.zero_state_stub);
        xqs xqsVar = new xqs(mJ(), this.ai.W, new xqb(this), this.ah, this.b.b());
        this.d = xqsVar;
        this.ai.ad(xqsVar);
        this.ai.aE(this.d.l);
        return inflate;
    }
}
