package com.example.happykitchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
//I am making changes to this
public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<StateModule> arrState = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrState.add(new StateModule("Maharashtra","Puran Poli",R.drawable.img_19,"This delectable food item is a sweet version of the loving parantha. The stuffing is made from jaggery (gur), yellow gram (chana) dal, plain flour, cardamom powder and ghee (clarified butter). It is a popular dish in festive occasions and also can be eaten at any time of the day. A tasty dessert does not need anyone's permission to be eaten!\n\n"));
        arrState.add(new StateModule("Maharashtra","Misal Pav",R.drawable.img_1,"Misal pav is a popular street food in Maharashtra. A great breakfast recipe that includes a curry made of sprouts, topped with finely chopped onions, tomatoes and ‘farsan’(fried savory mixture) and lime juice served pav, heated on the pan with a hint of butter.\n\n"));
        arrState.add(new StateModule("Maharashtra","Pav Bhaji",R.drawable.img_17,"Amchi Maharashtra food is incomplete without this dish which has come to be synonymous to the state! Fresh and thick slices of bread, smothered in butter served with a delicious mix of moderately spiced vegetables. This lip-smacking dish has won the heart of every Indian!\n\n"));
        arrState.add(new StateModule("Maharashtra","Vada Pav",R.drawable.img_18,"Vada Pav can easily be called the Indian version of a burger! A delicious, spicy, deep-fried patty made of potato is squeezed between a thick slice of bread, similar to a burger bun. Between the vada (patty) and pav (bread) a spicy mix of spices and salt is sprinkled and garnished with a fried, salted green chilli. Sounds perfect, isn't it? It's an all-day snack and is extremely popular among Maharashtrians. It is very economical, filling and easily accessible.\n\n"));
        arrState.add(new StateModule("Maharashtra"," Modak",R.drawable.img_20,"Modak is one of the most famous sweet found in Maharashtra and is extensively eaten during the Ganesh Chaturthi Festival all around the state. The sweet filling on the inner part of a modak consists of freshly grated coconut and jaggery while the outer shell is made out of rice flour and is very soft. With time, there have been varied types of modak such as Kesari modak, dark chocolate modak, motichoor modak, paneer modak, dry fruit modak and many more. This sweet is Ganpati's favourite and that is for a very definite reason for sure.\n\n"));
        arrState.add(new StateModule("Maharashtra","Ragda Pattice",R.drawable.img_21,"The much famed Ragda Patties or as the locals would name it Ragda 'pattice' (a localised version on the English 'patties') is a part of Maharashtra's delicious street food that one should never leave out on. It is a yet another lip-smacking street food in Mumbai which is prepared by using curried dried peas and patties. These potato patties are dipped in the Ragda gravy and topped with chaat chutneys, finely chopped onions, tomatoes, crispy sev and cilantro. The dish is regularly served at all restaurants in Maharashtra and is also an important part of the local street food as well.\n\n"));
        arrState.add(new StateModule("Maharashtra","Bharli Vangi",R.drawable.img_22,"This is a popular style of cooking brinjals or baby brinjals stuffed with coconut, onion, jaggery, Marathi goda masala. Brinjal has never been anybody's favourite vegetable per se. But this Maharashtra food dish has the capability to kick in life into this otherwise boring vegetable. This combination of ingredients does wonders to the brinjal.\n\n"));
        arrState.add(new StateModule("Maharashtra","Sreekhand",R.drawable.img_23,"Sreekhand is a sort of sweet yoghurt dish, flavoured with cardamom powder and saffron, this dish is a hit at weddings and at the festival of Dushera. It is usually served with piping, hot puris and is another Maharashtra food dish that is famous all over the country.\n\n"));
        arrState.add(new StateModule("Maharashtra","Sabudana khichdi",R.drawable.img_24,"Sabudana is 'sago' or tapioca starch. Khichdi roughly means 'mixture'. This unique dish is a popular breakfast item in Maharashtra food and cuisine and is one of the few food products which is consumed during the period of holy-fasting, 'upwaas'. The granular texture of sago prepared in a savoury mix turns out to be a delicious dish indeed.\n\n"));
        arrState.add(new StateModule("Maharashtra","Pithla Bhakri",R.drawable.img_25,"Pithla Bhakri is the recurrent 'comfort food' for most of the Maharashtrians. In fact, it is also known as the Farmer's meal in the state. Mostly, the hot pithra is united with bhakri and even roti at times as a reward after a long and tiring day at work. This simple dish doesn't require either too many complex ingredients or a lot of time to prepare. Instead, its the best dish to come up with when you are out of veggies. Mostly, pithla which is served with rice has a watery-liquid like consistency and a semi-liquid or dry pithla goes perfectly with bhakri or roti. A spicy version of the same is known as Zunka.\n\n"));
        arrState.add(new StateModule("Maharashtra","Bhelpuri",R.drawable.img_26,"Bhelpuri is a savoury snack common in Maharashtra and is found in abundance on the local streets. It is made of puffed rice, vegetables and a tamarind sauce for a tangy taste. Bhelpuri is considered to have originated from parts of Maharashtra and from there it has spread to different parts of the country. Bhelpuri can be served in a lot of ways, but usually it is served on a paper which is folded in the form of a cone and is consumed using a paper spoon. Different types of bhelpuri are ? sev puri, churmuri, sev papdi chat and dahi pudi.\n\n"));
        arrState.add(new StateModule("Maharashtra"," Basundi",R.drawable.img_27,"Basundi is a sweet dish made in Maharashtra. It is condensed by boiling the sweetened milk on low heat until it becomes half of its initial volume. Sugar, cardamom or saffron is added to augment the flavour and texture. Different types of basundi are also created such as custard apple basundi and angoor basundi (having small-sized rasgullas in basundi).\n\n"));
        arrState.add(new StateModule("Punjab","Makki Di Roti & Sarson Da Saag",R.drawable.img_2,"Makki di Roti is a corn meal Indian bread that tastes fabulous with ‘Sarson saag’ – mustard green and a glass of lassi. The dish is regarded as the traditional way to prepare saag and is usually served with makki di roti literally (unleavened cornbread). It can be topped with either Makkhan (unprocessed white butter or processed yellow butter) or more traditionally with ghee.\n\n"));
        arrState.add(new StateModule("Gujarat","Dhokla",R.drawable.img_4,"Dhokla is a vegetarian dish made from a fermented batter of rice and split chickpeas. It is served with tangy chutneys and can be eaten for breakfast, as a main course, as a side dish, or as a snack\n\n."));
        arrState.add(new StateModule("Tamil Nadu","Pongal",R.drawable.img_5,"Vegetarian Pongal is a rice lentil dish that is often prepared in south Indian homes as an offering to the goddess. But it is also a comfort food that is very easy to digest.\n\n"));
        arrState.add(new StateModule("Bihar","Litti Chowkha",R.drawable.img_6,"Litti Chowkha is baked from wheat flour dough, stuffed with a mixture of roasted gram flour, spices and lemon juice, and served with chokha (baked and pulped vegetables).\n\n"));
        arrState.add(new StateModule("Kerala","Appam",R.drawable.img_7,"Appam is a type of pancake made with fermented rice batter and coconut milk. The origin of Appam is disputed and potential sources of origin might be Sri Lanka or the southern tip of India. It is a common food in Sri Lanka and the Indian state of Kerala where it is eaten most frequently for breakfast or dinner.\n\n"));
        arrState.add(new StateModule("Rajasthan","Dal Baati Churma",R.drawable.img_8,"Dal Bati Churma is a traditional Rajasthani treat with the spicy dal with the sweet churma along with deep fried crunchy batis (bread).\n\n"));
        arrState.add(new StateModule("Rajasthan","Mohan Thaal",R.drawable.img_28,"This royal dessert is equally royal to amaze the taste buds of food connoisseurs. Mohan Thaal is unique to Rajasthan and is a sweet dish prepared from Besan and dry fruits. The aroma and taste of ghee add the cherry to the cake!\n\n"));
        arrState.add(new StateModule("Rajasthan","Mirchi Bada",R.drawable.img_29,"Another snacky delight from Rajasthan, Mirchi badas are perfect answers to complement evening tea or morning breakfast. The hot and spicy badas are scrumptiously delicious.\n\n"));
        arrState.add(new StateModule("Rajasthan","Kalakand",R.drawable.img_30,"The lion gate of Rajasthan is also famous for its soft and delicious Mawa-dish called kalakand. An ancient sweet dish, Alwar's Kalakand stands apart as a heavenly delicacy.\n\n"));
        arrState.add(new StateModule("Rajasthan","Masala-Chhach",R.drawable.img_31,"Chhach or buttermilk is an inseparable part of Rajasthani food culture. Chhach is a must-have in the dessert climate and extreme weather conditions of the state. Masala Chhach is a tasty drink, usually taken with/after breakfasts and lunches. The drink is also independent of main course and is a boon for sweaty summers.\n\n"));
        arrState.add(new StateModule("Rajasthan","Malpua",R.drawable.img_32,"Malpuas are another authentic food of Rajasthan. This delicious dish, prepared from flour, milk, khoya and added dry-fruits. Complimentary servings include Rabdi with Malpua. Malpuas from Pushkar is famous, especially on MakarSankranti.\n\n"));
        arrState.add(new StateModule("Rajasthan","Bajra ki Roti with Lehsun Chutney",R.drawable.img_33,"Bajra is one of the most popular dishes in Rajasthan consumed by most states in India. The taste of crispy roti goes well with the lehsun and onion chutney. This spicy dish of Rajasthan lets your mouth water to the feeling of garlic cloves and red chilly powder. As the delicious dish slides down your throat, you can feel the aesthetic taste of Rajputana.\n\n"));
        arrState.add(new StateModule("Rajasthan","Balushahi",R.drawable.img_34,"I'm sure if you're a south Indian you must have heard of Balushahi? Well, Balushahi is the name in North India. It resembles closely to glazed doughnuts without holes. The soft, sweet and delicious sweet gets you drooling, and it is one of the simple saccharine dishes that could be made hassle-free.\n\n"));
        arrState.add(new StateModule("Rajasthan","Boondi Raita",R.drawable.img_35,"Every Rajasthani food requires a stabilizer due to its wildness in flavours and spices. So instead of reaching out for a sip of water every time, have a spoon full of the refreshing Boondi Raita. A delicious, healthy blend of small fried chickpea flour balls called Boondi, soaked in the richness of yoghurt and fresh mint will make you savour all the Rajasthani dishes on another level! It is served cold as a side dish.\n\n"));
        arrState.add(new StateModule("Rajasthan","Badam ka Halwa",R.drawable.img_36,"For all the sweet tooth’s, it is time to soak your palate in the richness of Rajasthan’s signature sweet dish called Badam ka Halwa. Made with the royal touch of soaked almonds, ground and stewed in fineness of desi ghee, this dish is bound to leave you asking for another hot serve. It’s extremely addicting. And healthy too!\n\n"));
        arrState.add(new StateModule("Rajasthan","Methi Bajra Puri",R.drawable.img_37,"Who doesn’t love some hot snacks in winters? The traditional food of Rajasthani which is mostly eaten during winters, Methi Bajra Puri is a deep-fried puffed bread, made with the goodness of Bajra (pearl millet flour) and fresh methi (fenugreek leaves). Bajra provides a crunchy character to this healthy, light puffy delight, making it a perfect snack to munch on while cuddled inside the blanket. It can be savoured with a curry/sabzi as well, making it an appetizing whole meal.\n\n"));
        arrState.add(new StateModule("Rajasthan","Kalmi Vada",R.drawable.img_38,"Kalmi Vada is an authentic Rajasthani munchie, perfect for evening cravings. This crunchy, full filling, healthy snack is a melange of coarsely blended batter of chana dal (split chickpeas), elevated with some green chillies, onion, and common spices. Its stimulating flavours and texture will leave your hands reaching out for just one more again and again! It is served hot with refreshing green chutney.\n\n"));
        arrState.add(new StateModule("Chhattisgarh","Muthia",R.drawable.img_39,"Muthia are dumplings cooked in the traditional style of the Chhattisgarh state. Muthia is prepared with the rice batter which is seasoned with various spices. The dish is not fried but is steamed and hence it retains the original flavor of its ingredients. Muthia is a famous dish of the state which is usually enjoyed in the breakfast. This dish is also famous among the rural people of the state.\n\n"));
        arrState.add(new StateModule("Chhattisgarh","Bhajia",R.drawable.img_40,"Bhajia is a famous street food of Chhattisgarh which is very popular among the local people of the state. A local variant of Bhajji, a dish that is commonly found in South India. Bhajia in Chhattisgarh are prepared with different ingredients, each one of them adding a taste to the dish that will get your taste buds going. Bhajia is prepared with the gram flour along. Various type of Bhajis such as Mirchi Bhaji- prepared with chili, onion Bhaji prepared with onion, and Aloo Bhaji prepared with potato are some of the famous variants of the dish. The perfect aroma and the right amount spices add the delectable street food taste to this dish. Bhajia are best enjoyed with a hot cup of tea along with spicy Hari chutney.\n\n"));
        arrState.add(new StateModule("Sikkim","Momo",R.drawable.img_9,"Momo is a type of South Asian dumpling, served with spicy sauces, popular across the Indian subcontinent and the Himalayan regions of broader South Asia.\n\n"));
        arrState.add(new StateModule("Chhattisgarh","Chila",R.drawable.img_10,"A chila is a North-Indian crepe made out of chickpea flour. You can have your chila with chutney or roll it around a stuffing like Tofu Crumble.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Poha",R.drawable.img_11,"Super light and super healthy cuisine which is fondly eaten in all the parts of our country is given to India by Madhya Pradesh. Poha is made with the flattened rice along with the well-cooked onions, tomatoes and is best savoured with green chillies, curry leaves and a bit of lemon.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Daal Bafla",R.drawable.img_12,"Daal Bafla that is fondly served in many parts of Madhya Pradesh has got its influence from Rajasthani cuisine. Dal Bafla is a mouth-watering cuisine which is very similar to the famous Dal Bati of Rajasthan. Bafla is a delicious treat of the wheat balls well cooked in ghee. The dish is well complemented with a bowl of Dal and coriander sauce (Hari chutney). Dal Bafla is not only celestial in taste but also provides a good dose of multiple vitamins, proteins, carbohydrates and fat just in the right quantity.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Palak Puri",R.drawable.img_13,"Palak Puri is very fondly eaten as a breakfast meal and it is best served with aloo sabzi and raita for a perfect lunch meal. Palak Puri is prepared with wheat dough mixed with grind spinach leaves and some spices to get the best taste.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Malpua",R.drawable.img_14,"Malpua is majorly prepared with flour, fried in ghee and then dipped in the sugar syrup to add the taste that will make you crave for the dish again and again. The dressing of some saffron can further enhance the taste of this dish. Malpua is best served with rabdi for a complete treat.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Jalebi",R.drawable.img_15,"One dish that you will be seeing in every and nook of the state is Jalebi. And, trust me, you can expect a heavenly taste of this amazing delicacy of Madhya Pradesh even in the hidden interior of the state. The dish is prepared with utmost love in wheat flour, fried and then soaked in sugar syrup. The crisp taste of this sweet dish will revive your love for the most popular dish of Madhya Pradesh. For the best authentic taste, forget the big restaurant chains and make your way to the interiors of Madhya Pradesh where you will be served Jalebi in the most authentic and sinful manner.\n" +
                "\n" +
                "For the best Jalebis in Madhya Pradesh, you must visit Khandwa.\n\n"));
        arrState.add(new StateModule("Madhya Pradesh","Mawa Bati",R.drawable.img_16,"he perfect crisp, the right amount of sweetness and the perfect texture. Mawa Bati is probably one dish that defines the sweet dish palate of Madhya Pradesh. It is prepared with mava dough which is mixed with rich dry fruits. After deep frying the mava dough balls, the dish is well-soaked in the sugar syrup to add the sweetness in the dish. Mawa Bati is one dish that you cannot miss to munch on when you are in Madhya Pradesh.\n\n"));

        RecyclerStateAdapter recyclerStateAdapter = new RecyclerStateAdapter(this,arrState);
        recyclerView.setAdapter(recyclerStateAdapter);

    }
}