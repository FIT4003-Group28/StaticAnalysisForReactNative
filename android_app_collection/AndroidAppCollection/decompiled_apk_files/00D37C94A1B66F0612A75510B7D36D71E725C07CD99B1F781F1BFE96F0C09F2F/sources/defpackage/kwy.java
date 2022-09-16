package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwy  reason: default package */
/* loaded from: classes3.dex */
public final class kwy extends yo {
    public final ImageView t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public akhl y;
    final /* synthetic */ kwz z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwy(kwz kwzVar, View view) {
        super(view);
        this.z = kwzVar;
        this.x = view;
        this.t = (ImageView) view.findViewById(R.id.search_type_icon);
        this.u = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.edit_suggestion);
        this.v = imageView;
        this.w = (ImageView) view.findViewById(R.id.thumbnail);
        view.setOnClickListener(new kww(this, 1));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: kwx
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                final akhl akhlVar;
                kwy kwyVar = kwy.this;
                final kvu kvuVar = kwyVar.z.k;
                if (kvuVar == null || (akhlVar = kwyVar.y) == null) {
                    return false;
                }
                kwyVar.b();
                if (!akhlVar.b()) {
                    return false;
                }
                new AlertDialog.Builder(kvuVar.a.ap).setTitle(akhlVar.a).setMessage(R.string.delete_search_suggestion_confirmation).setPositiveButton(R.string.remove, new DialogInterface.OnClickListener() { // from class: kvt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        kvu kvuVar2 = kvu.this;
                        kvuVar2.a.s(akhlVar);
                    }
                }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
                return true;
            }
        });
        imageView.setOnClickListener(new kww(this));
    }
}
