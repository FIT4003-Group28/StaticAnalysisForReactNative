package com.facebook.react.views.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.views.picker.a;
/* loaded from: classes.dex */
public abstract class ReactPickerManager extends SimpleViewManager<com.facebook.react.views.picker.a> {
    @com.facebook.react.uimanager.a.a(a = "items")
    public void setItems(com.facebook.react.views.picker.a aVar, am amVar) {
        if (amVar != null) {
            an[] anVarArr = new an[amVar.size()];
            for (int i = 0; i < amVar.size(); i++) {
                anVarArr[i] = amVar.c(i);
            }
            b bVar = new b(aVar.getContext(), anVarArr);
            bVar.a(aVar.getPrimaryColor());
            aVar.setAdapter((SpinnerAdapter) bVar);
            return;
        }
        aVar.setAdapter((SpinnerAdapter) null);
    }

    @com.facebook.react.uimanager.a.a(a = "color", b = "Color")
    public void setColor(com.facebook.react.views.picker.a aVar, Integer num) {
        aVar.setPrimaryColor(num);
        b bVar = (b) aVar.getAdapter();
        if (bVar != null) {
            bVar.a(num);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "prompt")
    public void setPrompt(com.facebook.react.views.picker.a aVar, String str) {
        aVar.setPrompt(str);
    }

    @com.facebook.react.uimanager.a.a(a = "enabled", f = true)
    public void setEnabled(com.facebook.react.views.picker.a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "selected")
    public void setSelected(com.facebook.react.views.picker.a aVar, int i) {
        aVar.setStagedSelection(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.picker.a aVar) {
        super.onAfterUpdateTransaction((ReactPickerManager) aVar);
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, com.facebook.react.views.picker.a aVar) {
        aVar.setOnSelectListener(new a(aVar, ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher()));
    }

    /* loaded from: classes.dex */
    private static class b extends ArrayAdapter<an> {

        /* renamed from: a  reason: collision with root package name */
        private final LayoutInflater f4001a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f4002b;

        public b(Context context, an[] anVarArr) {
            super(context, 0, anVarArr);
            this.f4001a = (LayoutInflater) com.facebook.j.a.a.b(context.getSystemService("layout_inflater"));
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return a(i, view, viewGroup, false);
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return a(i, view, viewGroup, true);
        }

        private View a(int i, View view, ViewGroup viewGroup, boolean z) {
            an item = getItem(i);
            if (view == null) {
                view = this.f4001a.inflate(z ? 17367049 : 17367048, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(item.getString("label"));
            if (!z && this.f4002b != null) {
                textView.setTextColor(this.f4002b.intValue());
            } else if (item.hasKey("color") && !item.isNull("color")) {
                textView.setTextColor(item.getInt("color"));
            }
            return view;
        }

        public void a(Integer num) {
            this.f4002b = num;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0073a {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.react.views.picker.a f3999a;

        /* renamed from: b  reason: collision with root package name */
        private final c f4000b;

        public a(com.facebook.react.views.picker.a aVar, c cVar) {
            this.f3999a = aVar;
            this.f4000b = cVar;
        }

        @Override // com.facebook.react.views.picker.a.InterfaceC0073a
        public void a(int i) {
            this.f4000b.a(new com.facebook.react.views.picker.a.a(this.f3999a.getId(), i));
        }
    }
}
