package com.google.android.libraries.youtube.metadataeditor.geo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddPlaceEndpointOuterClass$AddPlaceEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import java.util.IdentityHashMap;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditLocation extends afqq implements View.OnClickListener {
    public afqo a;
    public acti b;
    public akbn c;
    public Place d;
    private final Drawable e;
    private final Drawable f;
    private final ViewGroup g;
    private final TextView h;
    private final ImageButton i;
    private final TextView j;
    private final TextView k;
    private final IdentityHashMap l;
    private asvh m;
    private boolean n;
    private apoj o;
    private apoj p;
    private Place q;

    public EditLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new IdentityHashMap();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, afrf.a, 0, 0);
        try {
            this.e = obtainStyledAttributes.getDrawable(10);
            this.f = obtainStyledAttributes.getDrawable(12);
            obtainStyledAttributes.recycle();
            setOrientation(1);
            inflate(context, R.layout.metadataeditor_location_view, this);
            TextView textView = (TextView) findViewById(R.id.location_setting_text);
            this.h = textView;
            textView.setOnClickListener(this);
            this.g = (ViewGroup) findViewById(R.id.place_suggestions);
            ImageButton imageButton = (ImageButton) findViewById(R.id.location_action_icon);
            this.i = imageButton;
            imageButton.setOnClickListener(this);
            this.j = (TextView) findViewById(R.id.location_search_notice);
            this.k = (TextView) findViewById(R.id.learn_more_button);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void h(apoj apojVar, Drawable drawable) {
        if (apojVar == null) {
            return;
        }
        this.i.setImageDrawable(drawable);
        if ((apojVar.b & 65536) != 0) {
            ImageButton imageButton = this.i;
            aovr aovrVar = apojVar.r;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            imageButton.setContentDescription(aovrVar.c);
        }
        Boolean bool = (Boolean) this.l.get(apojVar);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        this.b.u(new acte(apojVar.t), null);
        this.l.put(apojVar, true);
    }

    public final void a(asvh asvhVar) {
        this.m = asvhVar;
        if ((asvhVar.b & 8) != 0) {
            aunb aunbVar = this.m.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            this.p = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        if ((asvhVar.b & 16) != 0) {
            aunb aunbVar2 = this.m.f;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            this.o = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        this.g.removeAllViews();
        arag aragVar = null;
        if (asvhVar.g.size() > 0) {
            this.g.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(getContext());
            for (aunb aunbVar3 : asvhVar.g) {
                if (aunbVar3.qn(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer)) {
                    athg athgVar = (athg) aunbVar3.qm(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                    if ((athgVar.b & 2) == 0) {
                        String valueOf = String.valueOf(athgVar.c);
                        zep.b(valueOf.length() != 0 ? "Empty place received: ".concat(valueOf) : new String("Empty place received: "));
                    } else {
                        Button button = (Button) from.inflate(R.layout.metadataeditor_location_suggestion, (ViewGroup) null);
                        this.g.addView(button);
                        arag aragVar2 = athgVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        button.setText(ajgl.b(aragVar2));
                        apzg apzgVar = athgVar.f;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        button.setTag(apzgVar);
                        button.setOnClickListener(this);
                    }
                }
            }
        }
        if ((asvhVar.b & 32) != 0 && (aragVar = asvhVar.h) == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        if (!TextUtils.isEmpty(b)) {
            this.j.setText(b);
            this.j.setVisibility(0);
        }
        if ((asvhVar.b & 64) != 0) {
            akbm a = this.c.a(this.k);
            aunb aunbVar4 = asvhVar.i;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            a.b((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer), this.b);
        }
        boolean z = !akzj.f(this.d, this.q);
        if ((asvhVar.b & 4) != 0) {
            aunb aunbVar5 = this.m.d;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            athg athgVar2 = (athg) aunbVar5.qm(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
            if (athgVar2 != null && (athgVar2.b & 2) != 0) {
                String str = athgVar2.c;
                arag aragVar3 = athgVar2.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                this.q = new Place(str, ajgl.b(aragVar3).toString());
            }
        }
        if (z) {
            c(this.d);
        } else {
            c(this.q);
        }
    }

    public final void b() {
        arag aragVar = null;
        this.d = null;
        asvh asvhVar = this.m;
        int i = asvhVar.b & 2;
        if (i != 0) {
            TextView textView = this.h;
            if (i != 0 && (aragVar = asvhVar.c) == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        h(this.o, this.e);
        this.n = false;
        this.g.setVisibility(0);
    }

    public final void c(Place place) {
        if (place == null) {
            b();
            return;
        }
        this.d = place;
        this.h.setText(place.b);
        h(this.p, this.f);
        this.n = true;
        this.g.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.i) {
            if (this.n) {
                b();
            } else {
                this.a.r();
            }
        } else if (view == this.h) {
            this.a.r();
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof apzg)) {
                return;
            }
            apzg apzgVar = (apzg) tag;
            arag aragVar = null;
            if ((apzgVar.b & 1) != 0) {
                this.b.H(3, new acte(apzgVar.c), null);
            }
            if (!apzgVar.qn(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint)) {
                zep.b("AddPlaceEndpoint not returned for place suggestion.");
                return;
            }
            AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = (AddPlaceEndpointOuterClass$AddPlaceEndpoint) apzgVar.qm(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint);
            String str = addPlaceEndpointOuterClass$AddPlaceEndpoint.c;
            if ((addPlaceEndpointOuterClass$AddPlaceEndpoint.b & 2) != 0 && (aragVar = addPlaceEndpointOuterClass$AddPlaceEndpoint.d) == null) {
                aragVar = arag.a;
            }
            c(new Place(str, ajgl.b(aragVar).toString()));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        asvh asvhVar = savedState.b;
        if (asvhVar == null) {
            return;
        }
        a(asvhVar);
        c(savedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.d;
        savedState.b = this.m;
        return savedState;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new abjw(12);
        Place a;
        asvh b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = (Place) parcel.readParcelable(EditLocation.class.getClassLoader());
            this.b = (asvh) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(asvh.a);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
            parcel.writeParcelable(new ParcelableMessageLite(this.b), 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
