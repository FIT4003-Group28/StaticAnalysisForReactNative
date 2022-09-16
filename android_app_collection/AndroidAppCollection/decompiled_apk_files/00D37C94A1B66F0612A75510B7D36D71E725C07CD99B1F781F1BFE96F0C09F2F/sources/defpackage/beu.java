package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beu  reason: default package */
/* loaded from: classes2.dex */
public final class beu extends ArrayAdapter implements AdapterView.OnItemClickListener {
    private final LayoutInflater a;
    private final Drawable b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;

    public beu(Context context, List list) {
        super(context, 0, list);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.b = po.b(context, obtainStyledAttributes.getResourceId(0, 0));
        this.c = po.b(context, obtainStyledAttributes.getResourceId(1, 0));
        this.d = po.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.e = po.b(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r0 != null) goto L18;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            android.view.LayoutInflater r8 = r6.a
            r1 = 2131624801(0x7f0e0361, float:1.8876792E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lc:
            java.lang.Object r7 = r6.getItem(r7)
            bhc r7 = (defpackage.bhc) r7
            r9 = 2131429732(0x7f0b0964, float:1.8481145E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131429730(0x7f0b0962, float:1.848114E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.d
            r9.setText(r2)
            java.lang.String r2 = r7.e
            int r3 = r7.h
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L33
            if (r3 != r4) goto L45
        L33:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L54
        L45:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L54:
            boolean r9 = r7.g
            r8.setEnabled(r9)
            r9 = 2131429731(0x7f0b0963, float:1.8481143E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto Lad
            android.net.Uri r0 = r7.f
            if (r0 == 0) goto L93
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L7c
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L7c
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L7c
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L7c
            if (r0 == 0) goto L93
            goto Laa
        L7c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MediaRouteChooserDialog"
            android.util.Log.w(r2, r0, r1)
        L93:
            int r0 = r7.m
            if (r0 == r4) goto La8
            if (r0 == r5) goto La5
            boolean r7 = r7.k()
            if (r7 == 0) goto La2
            android.graphics.drawable.Drawable r0 = r6.e
            goto Laa
        La2:
            android.graphics.drawable.Drawable r0 = r6.b
            goto Laa
        La5:
            android.graphics.drawable.Drawable r0 = r6.d
            goto Laa
        La8:
            android.graphics.drawable.Drawable r0 = r6.c
        Laa:
            r9.setImageDrawable(r0)
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((bhc) getItem(i)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bhc bhcVar = (bhc) getItem(i);
        if (bhcVar.g) {
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            bhcVar.g();
        }
    }
}
