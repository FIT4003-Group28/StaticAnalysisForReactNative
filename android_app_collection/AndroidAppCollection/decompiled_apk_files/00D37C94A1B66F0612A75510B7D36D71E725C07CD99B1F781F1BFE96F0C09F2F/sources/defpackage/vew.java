package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vew  reason: default package */
/* loaded from: classes4.dex */
public abstract class vew extends dh {
    public ListAdapter aC;

    public static int aO(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    protected abstract ListAdapter aG();

    protected abstract AdapterView.OnItemClickListener aI();

    protected abstract String aJ();

    @Override // defpackage.dh, defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
    }

    @Override // defpackage.dh, defpackage.dp
    public void mS() {
        super.mS();
        Window window = this.d.getWindow();
        int i = -1;
        if (mv() == 2 && aO(mJ()) > 600) {
            i = -2;
        }
        window.setLayout(i, -2);
        this.d.getWindow().setBackgroundDrawableResource(17170443);
        this.d.getWindow().setGravity(81);
        this.d.getWindow().setWindowAnimations(R.style.SlideUpDownAnimation);
    }

    @Override // defpackage.dp
    public View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.aC = aG();
        int mv = mv();
        if (mv == 0) {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
            ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
            listView.setAdapter(this.aC);
            listView.setOnItemClickListener(aI());
        } else if (mv != 1) {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_dialog_fragment, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.bottom_sheet_grid_fragment, viewGroup, false);
            GridView gridView = (GridView) inflate.findViewById(R.id.bottom_sheet_grid_view);
            gridView.setAdapter(this.aC);
            gridView.setOnItemClickListener(aI());
        }
        String aJ = aJ();
        TextView textView = (TextView) inflate.findViewById(R.id.bottom_sheet_title);
        if (TextUtils.isEmpty(aJ)) {
            textView.setVisibility(8);
        } else {
            textView.setText(aJ);
            textView.setVisibility(0);
        }
        return inflate;
    }

    protected abstract int mv();
}
