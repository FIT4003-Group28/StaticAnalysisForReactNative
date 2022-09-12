package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TurnEvent extends AbstractBundleable {
    public static final Parcelable.Creator<TurnEvent> CREATOR = new cld(TurnEvent.class);
    public int a;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    public int j;
    public List<String> l;
    public List<Lane> m;
    public List<String> n;
    public List<DestinationDistance> o;
    private String p;
    public CharSequence b = "";
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int k = 0;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("turn_event", this.a);
        bundle.putCharSequence("turn_event_road", this.b);
        bundle.putInt("turn_event_side", this.c);
        bundle.putInt("turn_angle", this.d);
        bundle.putInt("turn_number", this.e);
        bundle.putByteArray("turn_image", this.f);
        bundle.putInt("turn_distance", this.g);
        bundle.putInt("sec_to_turn", this.h);
        bundle.putInt("turn_unit", this.j);
        bundle.putInt("turn_distance_e3", this.i);
        bundle.putInt("maneuver_type", this.k);
        List<String> list = this.l;
        ArrayList<? extends Parcelable> arrayList = null;
        bundle.putStringArrayList("cue_alternate_texts", list == null ? null : new ArrayList<>(list));
        bundle.putString("current_road", this.p);
        List<Lane> list2 = this.m;
        bundle.putParcelableArrayList("lanes", list2 == null ? null : new ArrayList<>(list2));
        List<String> list3 = this.n;
        bundle.putStringArrayList("destination_addresses", list3 == null ? null : new ArrayList<>(list3));
        List<DestinationDistance> list4 = this.o;
        if (list4 != null) {
            arrayList = new ArrayList<>(list4);
        }
        bundle.putParcelableArrayList("destination_distances", arrayList);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("turn_event");
        this.b = bundle.getCharSequence("turn_event_road", "");
        this.c = bundle.getInt("turn_event_side");
        this.d = bundle.getInt("turn_angle");
        this.e = bundle.getInt("turn_number");
        this.f = bundle.getByteArray("turn_image");
        this.g = bundle.getInt("turn_distance", -1);
        this.h = bundle.getInt("sec_to_turn", -1);
        this.j = bundle.getInt("turn_unit");
        this.i = bundle.getInt("turn_distance_e3", -1);
        this.k = bundle.getInt("maneuver_type", 0);
        this.l = bundle.getStringArrayList("cue_alternate_texts");
        this.p = bundle.getString("current_road", null);
        this.m = bundle.getParcelableArrayList("lanes");
        this.n = bundle.getStringArrayList("destination_addresses");
        this.o = bundle.getParcelableArrayList("destination_distances");
    }
}
